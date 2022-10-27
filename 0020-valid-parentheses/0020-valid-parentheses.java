class Solution {
    public boolean isValid(String s) {
      int n = s.length();
        if(n%2 != 0)
            return false;
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if(match(st.peek(), ch)){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
    public boolean match(char a, char b){
        if(a == '(' && b == ')')
            return true;
        if(a == '{' && b == '}')
            return true;
        if(a == '[' && b == ']')
            return true;
        return false;
    }
}