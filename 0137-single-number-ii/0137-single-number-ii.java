class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int ans = 0;  
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(int x : nums){
            if(map.get(x) == 1){
                ans = x;
            }
        }
        return ans;
    }
}