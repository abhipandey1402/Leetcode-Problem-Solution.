class Solution {
    public int[][] generateMatrix(int n) {
      
        int[][] ans = new int[n][n];
        int nums = 1;
        
        int left = 0, right = n-1, top = 0, bottom = n-1;
        
        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                ans[top][i] = nums++;
            }
            for(int i=top+1; i<bottom; i++){
                ans[i][right] = nums++;
            }
            if(top<bottom){
            for(int i=right; i>=left; i--){
                ans[bottom][i] = nums++;
            }
            }
            if(left<right){
            for(int i=bottom-1; i>top; i--){
                ans[i][left] = nums++;
            }
            }
            left++;
            top++;
            bottom--;
            right--;
    }
        return ans;
}
}