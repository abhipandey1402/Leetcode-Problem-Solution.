class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      
        int start=0, end=0, sum=0, size = 0, minSize=Integer.MAX_VALUE;
        
        for(end=0; end<nums.length; end++){
            sum += nums[end];
            while(sum>=target){
                size = end-start+1;
                minSize = Math.min(minSize, size);
                sum -= nums[start];
                start++;
            }
        }
        // end++;
        if(minSize == Integer.MAX_VALUE){
            return 0;
        }
        return minSize;
    }
}