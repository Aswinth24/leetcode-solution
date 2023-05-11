class Solution {
    public int trap(int[] array) {
        int n=array.length;
        int[] store=new int[n];
        int i=0;
        int j=i+1;
        int total=0;
        while(j<n)
        {
            if(array[i]>array[j])
            {
                store[j]=array[i]-array[j];
                j++;
            }
            else
             {
                 i=j;j++;
             }
        }
        i=n-1;
        j=i-1;
        while(j>=0)
        {
            if(array[i]>array[j])
            {
                store[j]=Math.min(array[i]-array[j],store[j]);
                total+=store[j];
                j--;

            }
            else{
              i=j;
              j--;
            }
        }
        return total;
    }
}