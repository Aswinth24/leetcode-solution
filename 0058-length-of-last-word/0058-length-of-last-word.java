class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
    int res=0;
    int i=1;
    if(s.charAt(0)!=' ')
        res++;
    for(i=1;i<n;i++)
    {
        if(s.charAt(i)=='\0')
            break;
        if(s.charAt(i)!=' ')
        {
            if(s.charAt(i-1)==' ')
                res=1;
            else
                res++;
         }
    }
    return res;
    }
}