class Solution {
    public int numIdenticalPairs(int[] nums) {
      int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n, 0)+1);
            ans += hm.get(n) - 1;
        }
        
        return ans;
    }
}