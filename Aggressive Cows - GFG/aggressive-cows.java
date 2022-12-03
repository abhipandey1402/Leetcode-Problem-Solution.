//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
     Arrays.sort(stalls);
     int ans = 0;
     int l = 1;
     int r = (stalls[n-1] - stalls[0]);
     
     while(l<=r){
         int mid = l+(r-l)/2;
         
         if(canPlaceCow(n, k, mid, stalls)){
             ans = mid;
             l = mid+1;
         }
         else{
             r = mid-1;
         }
     }
     return ans;
    }
    
    public static boolean canPlaceCow(int n, int cow, int dist, int[] arr){
        int count = 1;
        int coord = arr[0];
        
        for(int i=1; i<n; i++){
            if(arr[i] - coord >= dist){
                count++;
                coord = arr[i];
            }
            if(count == cow){
                return true;
            }
        }
        return false;
    }
}