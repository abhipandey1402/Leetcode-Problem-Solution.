class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<=n; i++){
            map.put(i, i);
        }
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
        }
        for(int key:map.keySet()){
            return key;
        }
        return 0;
    }
}