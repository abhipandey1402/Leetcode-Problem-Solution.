class Solution {
    public int distributeCandies(int[] candyType) {
      HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : candyType){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        return Math.min(map.size(), candyType.length/2);
    }
}