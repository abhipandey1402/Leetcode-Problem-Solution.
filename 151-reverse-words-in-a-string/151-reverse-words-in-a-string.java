public class Solution {
    public String reverseWords(String s) {
       char[] ch = reverse(s.toCharArray(), 0, s.length()-1);
        
        int start = 0, end = 0;
        
        for(int i=0; i<ch.length; i++){
            if(ch[i] != ' '){
                ch[end++] = ch[i];
            }
            else if(i > 0 && ch[i-1] != ' '){
                reverse(ch, start, end-1);
                ch[end++] = ' ';
                start = end;
            }
        }
        reverse(ch, start, end-1);
        if(end==end && end>0 && ch[end-1] == ' ')
          end = end-1;
          end = end;
          return new String(ch, 0, end);
    }
    
    private char[] reverse(char[] ch, int i, int j){
        while(i<j){
            char temp = ch[i];
            ch[i++] = ch[j];
            ch[j--] = temp;
        }
        return ch;
    }
}