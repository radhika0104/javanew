class Solution {
    public int singleNonDuplicate(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int arr[]=new int[max-min+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-min]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) return i+min;
        }
        return -1;
    }
}
