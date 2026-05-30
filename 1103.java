class Solution {
    public int[] distributeCandies(int candies, int n) {
        int [] res = new int[n];
        int idx = 0;
        int give = 1;
        while (candies > 0) {
            res[idx] += Math.min(candies, give);
            candies -= give;
            give++;
            idx = (idx + 1) % n;

        }
        return res;
    }
}
