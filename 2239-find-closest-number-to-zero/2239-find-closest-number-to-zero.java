class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = Integer.MAX_VALUE;
        
        for(int x : nums){
           if(Math.abs(x) < Math.abs(ans) || x==Math.abs(ans)){
               ans  = x;
           }
        }
        return ans;
    }
}