class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            int c= sb.indexOf(String.valueOf(ch));
            if(c!=-1){
                sb.delete(0,c+1);

            }
            sb.append(ch);
            max= Math.max(sb.length(),max);
        }
        return max;
        
    }
}
