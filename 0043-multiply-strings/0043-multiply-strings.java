class Solution {
    public String multiply(String n1, String n2) {
        if(n1.charAt(0)=='0'||n2.charAt(0)=='0')
           return "0";
        String[] array=new String[n2.length()];
        int index=0;
        String zero="";
        int carry=0;
        for(int i=n2.length()-1;i>=0;i--)
        {
            String temp="";
           
            int a=n2.charAt(i)-'0';
            for(int j=n1.length()-1;j>=0;j--)
            {
                int b=n1.charAt(j)-'0';
                int sum=a*b+carry;
                temp+=(sum%10);
                carry=sum/10;
            }
			if(carry!=0)
				array[index++]=zero+temp+carry;
			else
                array[index++]=zero+temp;
		carry=0;
           zero+="0";
        } 
        String ans="";
        carry=0;
        for(int i=0;i<array[array.length-1].length();i++)
        {   
            int sum=0;
           for(int j=0;j<array.length;j++)
           {
               if(i<array[j].length())
                   sum+=array[j].charAt(i)-'0';

           }
          ans=((sum+carry)%10)+ans;
          carry=(sum+carry)/10;
        }
        if(carry!=0)
          ans=carry+ans;

       return ans;

    }
}