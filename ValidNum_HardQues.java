class Solution {
    public boolean isNumber(String s) {
        if (s == null || s.trim().length() == 0) return false;

        boolean numSeen = false;
        boolean eSeen = false;
        boolean decimalSeen = false;

        s = s.trim();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            switch (c) {
                case '.':
                    if (decimalSeen || eSeen) return false;
                    decimalSeen = true;
                    break;

                case 'e':
                case 'E':
                    if (eSeen || !numSeen) return false;
                    eSeen = true;
                    numSeen = false;
                    break;

                case '+':
                case '-':
                    if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E')
                        return false;
                    break;

                default:
                    if (!isDigit(c)) return false;
                    numSeen = true;
            }
        }

        return numSeen;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
