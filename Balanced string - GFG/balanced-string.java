//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    static String BalancedString(int n) {

        int i=0;

        int j=25;

        StringBuffer ans=new StringBuffer();

        int z=n/26;

        for(i=0;i<z;i++)

        {

            ans.append("abcdefghijklmnopqrstuvwxyz");

        }

        i=0;

        

        if(n%2==0)

        {

           n=n%26;

           for(i=0;i<n/2;i++)

           {

               ans.append((char)(i+'a'));

           }

            for(j=26-(n/2);j<=25;j++)

            {

                ans.append((char)(j+'a'));

            }

        }

        else

        {

            int sum=0;

            int temp=n;

            n=n%26;

            while(temp>0)

            {

                sum=sum+(temp%10);

                temp=temp/10;

            }

            if(sum%2==0)

            {

                 for(i=0;i<(n+1)/2;i++)

                ans.append((char)(i+'a'));

                for(j=26-((n-1)/2);j<=25;j++)

                 ans.append((char)(j+'a'));

            }

            else

            {

                for(i=0;i<(n-1)/2;i++)

                ans.append((char)(i+'a'));

                for(j=26-(n+1)/2;j<=25;j++)

                 ans.append((char)(j+'a'));

            }

        }

        return ans.toString();

    }

}