class Solution {
    public int sumOfUnique(int[] nums) {
      int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : nums){
           map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == 1){
                sum += nums[i];
            }
        }
        return sum;
    }
}