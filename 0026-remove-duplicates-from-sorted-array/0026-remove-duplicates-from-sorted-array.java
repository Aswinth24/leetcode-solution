class Solution {
    public int removeDuplicates(int[] nums) {
        
        int min=nums[0];
        int k=1;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]!=min)
           {
               nums[k++]=nums[i];
               min=nums[i];
           }
        }
        return k;
    }
}