class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int count=0;
      boolean[]freq= new boolean[256];
      for(int i=0;i<jewels.length();i++){
        freq[jewels.charAt(i)]= true;
      }
      for(int i=0;i<stones.length();i++){
        if(freq[stones.charAt(i)]==true){
            count++;
        }
      }
      return count;
    }
}
