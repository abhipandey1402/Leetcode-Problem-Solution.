class Solution {
    public int trap(int[] height) {
      int n = height.length;
        int l = 0, r = n-1, sum = 0, lMax = 0,  rMax = 0;
        
        if(n<=2){
            return 0;
        }
        
        while(l<r){
            if(height[l] <= height[r]){
                if(height[l] >= lMax){
                    lMax = height[l];
                }
                else{
                    sum += lMax-height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rMax){
                    rMax = height[r];
                }
                else{
                    sum += rMax - height[r];
                }
                r--;
            }
        }
        return sum;
    }
}