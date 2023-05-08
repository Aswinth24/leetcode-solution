class Solution {
    public boolean substring(String s,int i,String p)
     {   
         int j=0;
         while(j<p.length())
           if(s.charAt(i++)!=p.charAt(j++))
              return false;
        return true;
     }
    public int strStr(String haystack, String needle) 
    {
        int i=0;
        int j=needle.length()-1;
        while(j<haystack.length())
        {
            if(substring(haystack,i,needle))
                return i;
            i++;
            j++;
        }
        return -1;
        
    }}