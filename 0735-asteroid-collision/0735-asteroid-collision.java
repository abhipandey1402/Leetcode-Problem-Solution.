class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            if(i > 0){
                st.push(i);
            }
           else{
           while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(i)){
               st.pop();
           }
               if(st.isEmpty() || st.peek() < 0){
                   st.push(i);
               }
               else if(st.peek() == Math.abs(i)){
                   st.pop();
               }
            } 
        }
        int ans[] = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}