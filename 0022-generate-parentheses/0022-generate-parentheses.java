class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
        generate(n, ans, "", 0);
        return ans;
    }
    public void generate(int n, List<String> ans, String s, int excess){
        if(s.length() == 2*n){
        if(excess == 0)
            ans.add(s);
            return;
        }
        
        generate(n, ans, s + "(", excess+1);
        
        if(excess > 0){
            generate(n, ans, s + ")", excess-1);
        }     
    }
}