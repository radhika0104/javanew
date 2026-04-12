class Solution {
    public void rotate(int[][] matrix) {
        //transpose
        for (int i=1;i<matrix.length;i++){
            
            for (int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        //reverse each row
        for (int i=0;i<matrix.length;i++){
            int a=0,b=matrix[0].length-1;

            while(a<b){
                int temp= matrix[i][a];
                matrix[i][a]= matrix[i][b];
                matrix[i][b]= temp;
                a++;
                b--;
            }
        }
    }
}
