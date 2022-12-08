//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int q = sc.nextInt();
            ArrayList<Long> query = new ArrayList<>();
            for(int i=0;i<q;i++){
                query.add(sc.nextLong());
            }
            Solution ob = new Solution();
                
            ArrayList<Integer> ans = ob.threeDivisors(query,q);
            for(int cnt : ans) {
                System.out.println(cnt);
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{

    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q){
        // code here
        int k=0,h=0;
        ArrayList<Integer>ar=new ArrayList<>();
        
        for(long i:query){
            k=0;
            h=0;
            
            for(long j=2l;j*j<=i;j++){
                  k=0; 

                for(int l=2;l*l<=j;l++){
                    if(j%l==0){
                        k=1;
                        break;
                    }
                }   

                if(k==0){
                    h++;
                }   // System.out.println()
            }
             ar.add(h);
        }
        return ar;
    }
}