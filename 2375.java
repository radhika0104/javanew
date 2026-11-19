import java.util.Stack;

class Solution {
    public String smallestNumber(String pattern) {

        int[] ans = new int[pattern.length() + 1];
        Stack<Integer> st = new Stack<>();
        int c = 1;

        for (int i = 0; i <= pattern.length(); i++) {

            st.push(i);

            if (i == pattern.length() || pattern.charAt(i) == 'I') {

                while (!st.isEmpty()) {
                    ans[st.pop()] = c++;
                }
            }
        }

        String s = "";

        for (int x : ans) {
            s += x;
        }

        return s;
    }
}
