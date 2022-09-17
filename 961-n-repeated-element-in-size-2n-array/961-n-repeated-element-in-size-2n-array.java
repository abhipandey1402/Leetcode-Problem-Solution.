class Solution {
    public int repeatedNTimes(int[] nums) {
        // int ans = 0;
     HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
            if(map.get(x)==nums.length/2){
                return x;
            }
        }
       throw null; 
    }
}