class Solution {
    public boolean check(int[][]m,int[][]t)
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            int st=0;
            int end=n-1;
            while(st<=end)
            {
                if(m[i][st]!=t[i][st])
                   return false;
                if(m[i][end]!=t[i][end])
                   return false;
                st++;
                end--;
            }
        }
        return true;
    }
    public boolean rotate(int[][] m,int[][] t)
    {
         int n=m.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
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
        return check(m,t);
    }
    public boolean findRotation(int[][] m, int[][] target) 
    {
        if(check(m,target))
           return true;
        for(int i=0;i<3;i++)
          if(rotate(m,target))
              return true;
        return false;

        
    }
}