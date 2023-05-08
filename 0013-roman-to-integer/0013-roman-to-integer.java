class Solution {
     int value(char r)
        {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
       }
    public int romanToInt(String s) {
        
       
        int result=0;
        int n=s.length();
       for(int i=0;i<n;i++)
       {
           int n1=value(s.charAt(i));
          
           if(i+1<n)
           { 
               int n2=value(s.charAt(i+1));
               if(n1<n2)
               {
                    result=result+n2-n1;
                   i++;
               }  
               else{
                  result+=n1;
               }
           }
           else
               result+=n1;
       }
       
        return result;
    }
}