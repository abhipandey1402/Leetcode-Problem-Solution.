class Solution {
    public boolean isAnagram(String s, String t) {
      int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
           hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<n; i++){
            char ch = t.charAt(i);
           hm.put(ch, hm.getOrDefault(ch, 0)-1); 
        }
        for(char x : hm.keySet()){
            if(hm.get(x) != 0){
                return false;
            }
        }
        return true;
    }
}