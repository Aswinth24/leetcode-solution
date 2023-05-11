class Solution {
    public int maxArea(int[] h) {
    
    int max=0;
    int i=0;
    int n=h.length-1;
    int j=n;
    while(j>i)
    {
        int len=0;
        if(h[i]<h[j])
        {
          len=h[i]*n;
          i++;
          n--;
        }
        else
        {
            len=h[j]*n;
            j--;
            n--;
        }
        max=Math.max(max,len);
    }
    return max;
    }
}