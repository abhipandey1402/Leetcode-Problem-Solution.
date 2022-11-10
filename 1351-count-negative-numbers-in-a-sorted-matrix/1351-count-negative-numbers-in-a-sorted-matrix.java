class Solution {
    public int countNegatives(int[][] grid) {
     int negativeCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        
        int i = 0, j = n-1;
        
        while(i < m && j >= 0){
            if(grid[i][j] < 0){
                negativeCount += m - i;
                j--;
            }
            else{
                i++;
            }
        }
        return negativeCount;
    }
}