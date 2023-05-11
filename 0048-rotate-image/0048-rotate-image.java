class Solution {
    public void rotate(int[][] m) 
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            int st=i;
            int end=n-1;
            while(st<=end)
            {
                int temp=m[st][end];
                m[st][end]=m[end][st];
                m[end][st]=temp;    
                end--;
            }
        }
         for(int i=0;i<n;i++)
        {
            int st=0;
            int end=n-1;
            while(st<end)
            {
                int temp=m[i][st];
                m[i][st]=m[i][end];
                m[i][end]=temp;
                st++;
                end--;
            }   
        }
    }
}