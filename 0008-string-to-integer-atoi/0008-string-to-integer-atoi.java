class Solution {
    public int myAtoi(String s) {
       s=s.trim();
       if(s.length()==0)
          return 0;
       int sign=1;
       long sum=0;
       int i=0;
       if(s.charAt(0)=='-') sign=-1;
       if(s.charAt(0)=='-'||s.charAt(0)=='+')++i;
        while(i<s.length())
        {
            if(s.charAt(i)<'0'||s.charAt(i)>'9')
                break;
            else 
                sum=sum*10+(s.charAt(i)-'0');
            if(sum>Integer.MAX_VALUE)
            {
              return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            } 
            i++;  
        }
        return (int)(sign*sum);
    }
}