class Solution {
    public String removeDuplicates(String s) {
      int n = s.length();
        
        Stack<Character> st = new Stack<Character>();
        
        for(int i=n-1; i>=0; i--){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(st.peek() == s.charAt(i)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        
        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
         sb = sb.append(st.pop());   
        }  
        return sb.toString();
    }
}