class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        int i=1;
        while(i<=2*n){
            if(i%2==0){
                sumeven+=i;
                i++;
            }
            else{
            sumodd+=i;
             i++;
            }
           
        }
        int hcf=0;
        for(int k=1;k<=Math.max(sumodd,sumeven)/2;k++){
            if(sumodd%k==0 && sumeven%k==0){
                hcf=Math.max(hcf,k);

            }
        }
        return hcf;
    }
}
