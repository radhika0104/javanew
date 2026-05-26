class Solution {
    public int numberOfSpecialChars(String word) {
        int small[] = new int[26];
        int big[] = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                big[ch - 'A']++;
            } else {
                small[ch - 'a']++;
            }
        }
        int count = 0;
        for (int k = 0; k < 26; k++) {
            if ((small[k] != 0 && big[k] != 0) && (small[k] >= 1 && big[k] >= 1)) {
                count++;
            }
        }
        return count;
    }
}
