class Solution {
    public String makeGood(String s) {
      Stack<Character> st = new Stack<>(); 
      int n = s.length();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(st.size() != 0 && Math.abs(ch - st.peek()) == 32){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        
        // StringBuilder sb = new StringBuilder();
        // while(st.size() != 0){
        //     sb.append(st.pop());
        // }
        // return sb.toString();
        String ans = "";
        while(st.size() != 0){
            ans = st.pop() + ans;
        }
        return ans;
    }
}