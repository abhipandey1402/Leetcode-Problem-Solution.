class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
       for(int r=0; r<matrix.length; r++){
           for(int c=0; c<matrix[0].length; c++){
               if(r < matrix.length-1 && c < matrix[0].length-1 && matrix[r+1][c+1] != matrix[r][c]){
                   return false;
               }
           }
       }
        return true;
    }
}