class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        
       int m  = matrix.length;
        int n = matrix[0].length;
        
        int left = 0, right = n-1, top = 0, bottom = m-1;
        
        while(left <= right && top <= bottom){
            for(int i=left; i<=right; i++){
                l.add(matrix[top][i]);
            }
            for(int i=top+1; i<bottom; i++){
                l.add(matrix[i][right]);
            }
            if(top<bottom){
            for(int i=right; i>=left; i--){
                l.add(matrix[bottom][i]);
            }
            }
            if(left<right){
            for(int i=bottom-1; i>top; i--){
                l.add(matrix[i][left]);
            }
            }
            left++;
            top++;
            bottom--;
            right--;
        }
        return l;
    }
}