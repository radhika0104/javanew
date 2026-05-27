class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l = nums.length;
        int min=0;
        int max=0;
        for(int i=0;i<k;i++){
            min+=nums[i];
            max+=nums[l-i-1];
        }
        int diff= Math.abs(max-min);
        return diff;
    }
}
