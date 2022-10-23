public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Map < Integer, Integer > map = new HashMap();
        ans[0] = -1;
        ans[1] = -1;
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    ans[0] = i;
            } else
                ans[1] = i;
        }
        return ans;
    }
}