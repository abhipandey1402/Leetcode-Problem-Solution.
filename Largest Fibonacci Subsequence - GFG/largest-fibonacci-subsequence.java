//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            int getAnswer[] = obj.findFibSubset(a, n);
            int sz = getAnswer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(getAnswer[i]+" ");
            System.out.println(output);
            
        }
	}
}



// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public int[] findFibSubset(int arr[], int n)
    {
    //   Integer max = Collections.max(Arrays.asList(arr));
    Integer max = 0;
    for(int i=0; i<n; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
      
      HashSet<Integer> fib = new HashSet<>();
      List<Integer> result = new ArrayList<>();
      
      int a = 0, b = 1;
      
      while(b < max){
          Integer c = a + b;
          a = b;
          b = c;
          fib.add(c);
      }
      for(int i = 0; i<n; i++){
          if(fib.contains(arr[i])){
              result.add(arr[i]);
          }
      }
      
      int ans[] = new int[result.size()];
      
      for(int x = 0; x<result.size(); x++){
          ans[x] = result.get(x);
      }
      return ans;
    }
}