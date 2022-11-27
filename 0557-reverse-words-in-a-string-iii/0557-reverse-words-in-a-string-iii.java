class Solution {
    public String reverseWords(String s) {
        int lastIndex = -1;
        char ch[] = s.toCharArray();
        int n = s.length();
        
        for(int i=0; i<=n; i++){            
            if(i == n || ch[i] == ' '){
                int start = lastIndex+1;
                int end = i-1;
            while(start < end){    
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
              lastIndex = i;
            }
        }
        return new String(ch);
    }
}