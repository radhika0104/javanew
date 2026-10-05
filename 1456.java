class Solution {
    public int maxVowels(String s, int k) {
        boolean[] vowels = new boolean[128];
        char [] arr="AEIOUaeiou".toCharArray();
        for(char ch:arr){
            vowels[ch]=true;
        }
        int l=0;
        int vowel_count=0;
        int max_vc=0;
        for(int r=0;r<s.length();r++){
            if(vowels[s.charAt(r)]){
                vowel_count++;
            }
            if(r-l+1==k){
                max_vc= Math.max(max_vc, vowel_count);
            
            if(vowels[s.charAt(l)]){
                vowel_count--;
            }
            l++;
        }
        }
        return max_vc;

    }
}
