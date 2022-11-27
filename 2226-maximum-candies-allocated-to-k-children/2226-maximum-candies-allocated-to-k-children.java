class Solution {
    public int maximumCandies(int[] candies, long k) {
        long left = 1;
        long right = 0;
        int n = candies.length;
        long ans = 0;
        for(int i=0; i<n; i++){
            right = Math.max(right, candies[i]);
        }

        while(left <= right){
            long piles = 0;
            long mid = left + (right-left)/2;
            for(int i=0; i<n; i++){
                piles += candies[i]/mid;
            }
            if(piles >= k){
               ans = Math.max(ans, mid);
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return (int)ans;
    }
}