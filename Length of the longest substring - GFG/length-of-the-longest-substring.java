//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
       int maxLength = 0;
       int start = 0;
       
       HashMap<Character, Integer> map = new HashMap<>();
       
       for(int end = 0; end < S.length(); end++){
           if(map.containsKey(S.charAt(end))){
               start = Math.max(start, map.get(S.charAt(end))+1);
           }
           map.put(S.charAt(end), end);
           maxLength = Math.max(maxLength, end-start+1);
       }
       return maxLength;
    }
}