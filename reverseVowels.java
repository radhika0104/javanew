class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {

            if (!isVowel(arr[i])) {
                i++;
            } else if (!isVowel(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
            return false;
    }
}
