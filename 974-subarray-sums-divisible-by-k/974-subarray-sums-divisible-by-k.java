class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int sum = 0;
        for(int a : nums){
            sum = (sum+a)%k;
            if(sum<0){
                sum += k;
            }
            ans += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}