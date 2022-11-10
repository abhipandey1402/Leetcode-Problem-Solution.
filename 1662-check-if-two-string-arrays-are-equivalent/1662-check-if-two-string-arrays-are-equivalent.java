class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder word1Comb = new  StringBuilder();
        for(String s : word1){
            word1Comb.append(s);
        }
        
        StringBuilder word2Comb = new  StringBuilder();
        for(String s : word2){
            word2Comb.append(s);
        }
        
        return word1Comb.compareTo(word2Comb) == 0;
    }
}