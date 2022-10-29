//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
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