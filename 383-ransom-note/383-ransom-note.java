class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     Map<Character, Integer> map = new HashMap<>();
        for(char i : magazine.toCharArray()){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(char x : ransomNote.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0){
                return false;
            }
            else{
                map.put(x, map.get(x)-1);
            }
        }
        return true;
    }
}