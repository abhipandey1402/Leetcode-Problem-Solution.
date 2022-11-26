class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int low = 1;
        int high = piles[0];
        int n = piles.length;
        int ans = 1;
        
        for(int i=1; i<n; i++){
            if(piles[i] > high){
                high = piles[i];
            }
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(mid, piles, h)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    
    private boolean isPossible(int k, int[] p, int h){
       long count = 0;
        for(int i : p){
            count += (long)i/k;
            if(i%k != 0){
                count++;
            }
        }
        return count <= h;
    }
}