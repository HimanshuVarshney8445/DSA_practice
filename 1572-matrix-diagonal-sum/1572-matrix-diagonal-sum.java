class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,j=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][j++];
        }
        j=0;
        for(int i=mat.length-1;i>=0;i--){
            sum+=mat[i][j++];
        }
        if(mat.length%2!=0){
            sum-=mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}