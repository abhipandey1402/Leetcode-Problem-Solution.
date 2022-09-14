class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount = 0 ,start= 0,end =0;
        int n = nums.length,ans = 0;
        for(end =0;end<n;end++){
            
            if(nums[end] == 0)
                zerocount++;
            
            while(zerocount > k){
                if(nums[start] == 0){
                    zerocount--;
                }
                
                start++;
            }
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }
}