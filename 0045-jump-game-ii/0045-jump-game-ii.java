class Solution {
    
    public int jump(int[] arr) 
    {
        if(arr[0]==0||arr[0]==1&&arr.length==1)return 0;
        int cur=0;
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,i+arr[i]);
            if(i==cur)
            {
                count++;
                cur=max;
               if(cur>=arr.length-1) break;
            }
        }
        return count;
        
    }
}