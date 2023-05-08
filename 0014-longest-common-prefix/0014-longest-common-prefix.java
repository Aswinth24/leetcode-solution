class Solution {
    public String longestCommonPrefix(String[] str) {
        
        int len=1000;
        int index=0;
        int n=str.length;
        for(int i=0;i<n;i++)
        {
            if(str[i].length()<len)
            {
               len=str[i].length();
               index=i;
            }
        }
        String ans="";
        for(int i=0;i<str[index].length();i++)
        {
            int ct=0;
             for(int j=0;j<str.length;j++)
             {
                 if(str[index].charAt(i)==str[j].charAt(i))
                          ct++;
                  else{
                      return ans;
                  }
             }
             if(ct==str.length)
                ans+=str[0].charAt(i);
        }
        return ans;
    }
}