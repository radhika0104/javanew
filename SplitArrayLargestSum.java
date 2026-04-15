class Solution {
    public int splitArray(int[] nums, int m) {
        int maxNum = 0;
        long total = 0;

        for (int el : nums) {
            maxNum = Math.max(el, maxNum);
            total += el;
        }

        long low = maxNum;
        long high = total;

        while (low < high) {
            long mid = low + (high - low) / 2;

            if (validDivPossible(mid, nums, m)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }

    public boolean validDivPossible(long maxPossibleSum, int[] nums, int m) {
        int totalSubsetCount = 1;
        long totalRunningSum = 0;

        for (int num : nums) {
            totalRunningSum += num;

            if (totalRunningSum > maxPossibleSum) {
                totalSubsetCount++;        // new subarray
                totalRunningSum = num;     // start fresh from current num
            }

            if (totalSubsetCount > m) {
                return false;
            }
        }

        return true;
    }
}
