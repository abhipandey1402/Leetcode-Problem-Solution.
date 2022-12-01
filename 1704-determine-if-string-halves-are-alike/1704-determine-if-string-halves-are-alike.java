class Solution {
    public boolean halvesAreAlike(String s) {
        int countA = 0;
        int countB = 0;
        int n = s.length();
        int mid = (0+n-1)/2;
        
        String a = s.substring(0, mid+1);
        String b = s.substring(mid+1, n);
        
        for(int i=0; i<n/2; i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U'){
                countA++;
            }
        }
        
        for(int i=0; i<n/2; i++){
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u' || b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I' || b.charAt(i) == 'O' || b.charAt(i) == 'U'){
                countB++;
            }
        }
        
        if(countA == countB)
        return true;
        
        return false;
    }
}