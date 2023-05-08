class Solution {
    public int removeElement(int[] nums, int val) {
      
        int i=0;
        int j=0;
        int count=0;
        while(i<nums.length)
        {
            if(nums[i]!=val)
            {
                int temp=nums[j];
                nums[j++]=nums[i];
                nums[i]=temp;
            }
            else
            {
             count++;
            }
            i++;
        }
        return nums.length-count;
    }
}