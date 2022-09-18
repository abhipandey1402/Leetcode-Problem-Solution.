class Solution {
    public int lengthOfLongestSubstring(String s) {
       if(s.length() == 0){
           return 0;
       } 
        int size = 0;
        int maxSize = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
        if(map.containsKey(ch)){
            size = Math.max(size, map.get(ch)+1);
        }
            map.put(ch, i);
            
            maxSize = Math.max(maxSize, i-size+1);
        }
            return maxSize;
    }
}