class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int maxlen = 0;
        int start = 0,end = 0,cost = 0;
        for(end = 0 ;end<n;end++){
            
            cost += Math.abs(s.charAt(end) - t.charAt(end));
            
            while(cost > maxCost){
                
                cost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxlen = Math.max(maxlen,end-start+1);
        }
        return maxlen;
    }
}