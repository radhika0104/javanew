class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=0;
        int ans= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                n=i;
                ans=Math.min(ans,Math.abs(n-start));
            }
        }
        return ans;

    }
}
