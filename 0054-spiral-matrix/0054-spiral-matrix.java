class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
    
    List<Integer> mat=new ArrayList<>();
    int r=0,c=0;
	int row=arr.length;//row
	int col=arr[0].length;              //coloumn
	while(r<row&&c<col)
    {
        for(int i=c;i<col;i++)
          mat.add(arr[r][i]);
        r++;
        for(int i=r;i<row;i++)
           mat.add(arr[i][col-1]);
        col--;
        if(r<row)
         {
             for(int i=col-1;i>=c;i--)
               mat.add(arr[row-1][i]);
            row--;
         }
         if(c<col){
          for(int i=row-1;i>=r;i--)
           mat.add(arr[i][c]);
         c++;
         }
    }
    return mat;
     
    }
}