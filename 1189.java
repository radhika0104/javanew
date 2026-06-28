class Solution {
    public int maxNumberOfBalloons(String text) {
        int c=0;
        while(true){
            String ktr= "balloon";
            for(int i=0;i<ktr.length();i++){
                char ch = ktr.charAt(i);

                int idx= text.indexOf(ch);

                if(idx==-1){
                    return c;
                }
                text = text.substring(0, idx) + text.substring(idx + 1);
            }
            c++;
        }
        
    }
}
