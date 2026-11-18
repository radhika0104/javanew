class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        subsets(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public void subsets(int start,int[] nums,List<Integer>temp,List<List<Integer>> ans){
         ans.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
            subsets(i+1,nums,temp,ans);
            //backtracking
            temp.remove(temp.size()-1);
       }

    }
}
