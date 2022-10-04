class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();
        Set<Integer> intersec = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }
        for(int x : nums2){
            if(set.contains(x)){
                intersec.add(x);
            }
        }
        
        int result[] = new int[intersec.size()];
        int i=0;
        
        for(Integer ans : intersec){
            result[i++] = ans;
        }
        return result;
    }
}