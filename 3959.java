class Solution {
    public boolean checkGoodInteger(int n) {
        int s=0,k=n;
        while(n!=0){
            s=s+(n%10);
            n=n/10;
        }
        int s1=0;
        while(k!=0){
            s1=s1+(k%10)*(k%10);
            k=k/10;
        }
        if(s1-s>=50)return true;
        return false;
    }
}
