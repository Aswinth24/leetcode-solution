class Solution {
    public int lengthOfLongestSubstring(String data) {
         
	
	  int n=data.length();
	 int i=0;
	 int max=0;
	
	 int first=0;
	  int len=0;
	  int array[]=new int[255];
      while(i<n)
	   {  
		 
		   array[data.charAt(i)]= array[data.charAt(i)]+1;
		   
		   if(array[data.charAt(i)]==2)//whether it has repeating character...
		   {
		       //System.out.println(array[data.charAt(i)]+"-"+i);
		       
		       int j=first;
		       while(j<=i)//run the loop from where i start 
		       {
		           array[data.charAt(j)]=0;
		           j++;
		       }
		       len=0;
               first++;
		       i= first-1;
		   }
		   else//if repeating charcter is one it check..
		   {
		      // System.out.println(array[data.charAt(i)]+"-"+i+"-"+data.charAt(i));
		       len++;
		   }
		   if(len>max)
		      max=len;
		   i++;
		   
	   }
        return max;
    }
}