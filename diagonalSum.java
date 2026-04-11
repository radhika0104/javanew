class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
              sum+=mat[i][i];
              sum+=mat[i][n-i-1];
        }
        if(n%2==1){ //oddnumber
            sum-=mat[n/2][n/2]; //middle element repeat
        }

        return sum;
    }
}
