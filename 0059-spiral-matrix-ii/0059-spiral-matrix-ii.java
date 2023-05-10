class Solution {
    public int[][] generateMatrix(int n) {
    
     int k=1;
     int[][] arr=new int[n][n]; 
    int r=0,c=0;
    int row=n,col=n;
    while(r<row&&c<col)
    {
        for(int i=c;i<col;i++)
           arr[c][i]=k++;
        r++;
        for(int i=r;i<row;i++)
           arr[i][col-1]=k++;
        col--;
        if(r<row)
        {
          for(int i=col-1;i>=c;i--)
             arr[row-1][i]=k++;
           row--;
        }
        if(c<col)
        {
            for(int i=row-1;i>=r;i--)
               arr[i][c]=k++;
            c++;
        }
    }
    return arr;
    }
}