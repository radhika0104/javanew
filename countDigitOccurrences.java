class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int[] freq = new int[10];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];

            if (n == 0) {
                freq[0]++;
            }
            while (n > 0) {
                int temp = n % 10;
                freq[temp]++;
                n /= 10;
            }
        }
        return freq[digit];
    }
}
