class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int product = nums[0];
        int n = nums.length;
        
        for(int i=1; i<n; i++){
            int temp = Math.max(nums[i], Math.max(nums[i]*max, nums[i]*min));
            min = Math.min(nums[i], Math.min(nums[i]*max, nums[i]*min));
            max = temp;
            
            product = Math.max(product, max);
        }
        return product;
    }
}