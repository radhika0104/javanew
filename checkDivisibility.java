class Solution {
    public boolean checkDivisibility(int n) {
        int DSum=0;
        int DProd=1;
        int sum=0;
        int num=n;
        // int temp=0;
        while(n!=0){
            int temp=n%10;
            DSum+=temp;
            DProd*=temp;
            n/=10;
          
        }
          sum= DSum+DProd;
        if(num%sum==0){
            return true;
        }
        else return false;
        

    }
}
