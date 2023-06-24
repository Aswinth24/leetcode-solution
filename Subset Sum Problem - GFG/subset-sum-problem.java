//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{

static int [][] dp;
    static Boolean isSubsetSum(int n, int arr[], int k){
        dp=new int[n][k];
        for(int i=0;i<n;i++)
         Arrays.fill(dp[i],-1);

        return subset(n-1,k,0,arr)==1?true:false;
    }
     public static int subset(int n,int k,int sum,int arr[])
    {
        if(sum==k)return 1;
        if(n<0||sum>k)return 0;   
        if(dp[n][sum]!=-1)
        {
            return dp[n][sum];
        }
        return dp[n][sum]=Math.max(subset(n-1,k,sum+arr[n],arr),subset(n-1,k,sum,arr));

    }
}