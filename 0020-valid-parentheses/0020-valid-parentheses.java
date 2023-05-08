class Solution {
    public boolean isValid(String s) 
    {
      char [] stack=new char[s.length()];
      int k=0;
      int n=s.length();
      for(int i=0;i<s.length();i++)
      {
           if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                 stack[k++]=s.charAt(i);
            else 
            {
                if(k==0)return false;
                if(s.charAt(i)==')'&&stack[--k]!='('||
                s.charAt(i)=='}'&&stack[--k]!='{'||
                s.charAt(i)==']'&&stack[--k]!='[')return false;
                
            }

      }
      return k==0?true:false;
    }
}