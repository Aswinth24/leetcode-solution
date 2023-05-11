class Solution {
   List<List<Integer>> array=new LinkedList<>();
     
	void permut(int[] nums,LinkedList<Integer> temp,boolean[] map)
	{
		  
		if(temp.size()==nums.length)
		{
		   array.add(new LinkedList<>(temp));
		   return ;
		}
		for(int j=0;j<nums.length;j++)
		{	 
           if(map[j]||j>0&&nums[j]==nums[j-1]&&!map[j-1]) continue;

		   
            map[j]=true;
            temp.add(nums[j]);
			permut(nums,temp,map);
            temp.removeLast();
            map[j]=false;
		   
		}
		return;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
         
	     Arrays.sort(nums);
	     permut(nums,new LinkedList<Integer>(),new boolean[nums.length]);
	     return array;
    }
}