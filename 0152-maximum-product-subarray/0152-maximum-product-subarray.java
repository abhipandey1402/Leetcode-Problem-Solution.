class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int product = nums[0];
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], nums[i]*max);
            min = Math.min(nums[i], nums[i]*min);
            
            product = Math.max(product, max);
        }
        return product;
    }
}