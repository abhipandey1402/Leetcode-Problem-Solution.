class Solution {
    public int maxSubArray(int[] nums) {
      int sum = 0;
      int maxy = Integer.MIN_VALUE;
        
        for(int x : nums){
            sum += x;
            
            maxy = Math.max(maxy, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxy;
    }
}