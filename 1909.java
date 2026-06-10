class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for (int rem = 0; rem < nums.length; rem++) {
            boolean incr = true;
            int prev = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (i == rem)
                    continue;
                if (prev >= nums[i]) {
                    incr = false;
                    break;
                }
                prev = nums[i];
            }
            if (incr)
                return true;
        }
        return false;

    }
}
