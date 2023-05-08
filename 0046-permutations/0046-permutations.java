class Solution 
{
 void swap(int[] nums,int i,int j)
	{
		   int temp=nums[i];
		   nums[i]=nums[j];
		   nums[j]=temp;
	}
	 void permut(int[] nums,int i,List<List<Integer>>array)
	{
		
		if(i>=nums.length){
			ArrayList<Integer> temp=new ArrayList<Integer>();
	for(int j=0;j<nums.length;j++)
			temp.add(nums[j]);
			 array.add(temp);
		   return ;
		}
		for(int j=i;j<nums.length;j++)
		{	 
		    swap(nums,i,j);
			permut(nums,i+1,array);
		    swap(nums,i,j);
		}
		return;
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> array=new ArrayList<>();
	     permut(nums,0,array);
	     return array;
    }
}