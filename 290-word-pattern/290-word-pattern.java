class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(word.length != pattern.length())
            return false;
        for(int i=0; i<word.length; i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i]))
                    return false;
            }else{
                if(map.containsValue(word[i]))
                    return false;
                map.put(c, word[i]);
            }    
        }
        return true;
    }
}