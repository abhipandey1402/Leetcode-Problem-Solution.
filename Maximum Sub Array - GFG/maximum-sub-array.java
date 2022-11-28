//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        int currSum = 0;
        int maxSum = 0;
        
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            if(i == n || a[i] < 0){
                if(currSum > maxSum){
                    maxSum = currSum;
                    ans = new ArrayList<>(temp);
                }
                currSum = 0;
                temp.clear();
            }
            else{
                 currSum += a[i];
                 temp.add(a[i]);
            }
        }
        
        if(ans.size() == 0){
            return new ArrayList<>(Arrays.asList(-1));
        }
        return ans;
    }
}