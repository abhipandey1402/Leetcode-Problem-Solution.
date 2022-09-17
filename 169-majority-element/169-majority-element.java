class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0;
       HashMap<Integer, Integer> count = new HashMap<>();
        for(int x : nums){
            count.put(x, count.getOrDefault(x, 0)+1);
        }
        
        for(int i : nums){
            if(count.get(i) > (nums.length/2)){
                ans = i;
            }
        }
        return ans;
    }
}