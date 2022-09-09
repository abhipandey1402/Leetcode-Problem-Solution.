class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        int ans = 0;
        
        for(int i : hm.keySet()){
            if(k>0 && hm.containsKey(i+k) || k==0 && hm.get(i) > 1){
                ans++;
            }
        }
        return ans;
    }
}