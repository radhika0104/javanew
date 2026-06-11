class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length / 4;
        int freq[] = new int[100001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > n)
                return i;
        }
        return -1;

    }
}
