class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] present = new boolean[101];
        for (int num : nums) {
            present[num] = true;
        }
        int multiple = k;
        while (true) {
            if (multiple >= present.length || !present[multiple]) {
                return multiple;
            }
            multiple += k;
        }
    }
}
