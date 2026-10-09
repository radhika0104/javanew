class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] str= s.toCharArray();
        int n= shifts.length;
        int shift=0;
        for(int i=s.length()-1;i>=0;i--){
            shift+=shifts[i];
            shift%=26;
            str[i]= (char)('a'+ (str[i]-'a'+shift)%26);       
     }
     return new String(str);
    }
}
