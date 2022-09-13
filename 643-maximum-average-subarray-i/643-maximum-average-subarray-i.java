class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0;
        double maxAverage = 0;
        
        for(int end=0; end<k; end++){
            average += nums[end];
        }
        maxAverage = average;
        
        for(int start=k; start<nums.length; start++){
            average += nums[start] - nums[start-k];
            
            maxAverage = Math.max(average, maxAverage);
        }
        
        return maxAverage/k;
    }
}