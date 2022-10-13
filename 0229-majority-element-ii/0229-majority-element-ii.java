class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> l = new ArrayList<>(); 
      HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(int i : map.keySet()){
            if(map.get(i) > nums.length/3){
                l.add(i);
            }
        }
        return l;
    }
}