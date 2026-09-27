class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] p= new int[26];
        int [] q= new int[26];
        int l=0;
        int k=s1.length();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            p[ch-'a']++;
        }
        for(int r=0;r<s2.length();r++){
            char ch2= s2.charAt(r);
            q[ch2-'a']++;
            if(r-l+1==k){
                if(Arrays.equals(p,q)){
                    return true;
                }
                char chl= s2.charAt(l);
                q[chl-'a']--;
                l++;
            }
        }
        return false;
    }
}
