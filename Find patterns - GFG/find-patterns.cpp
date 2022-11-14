//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function template for C++

class Solution{   
public:
    int numberOfSubsequences(string S, string W){
        // code here 
        int cnt = 0, k = 0;
        for(int i=0;i<S.length();i++){
            k = 0;
            for(int j = 0;j<S.length();j++){
                if(S[j] == W[k]){
                    S[j] = '#';
                    k++;
                }
                if(k == W.length()) break;
            }
            if(k == W.length()) cnt++;
        }
        return cnt;
    }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string S,W;
        cin >> S >> W;
        Solution ob;
        cout << ob.numberOfSubsequences(S,W) << endl;
    }
    return 0; 
} 


// } Driver Code Ends