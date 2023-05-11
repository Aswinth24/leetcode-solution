class Solution {
    public void combination(List<List<Integer>> array,int[] candidates, int target,int i,int sum,ArrayList<Integer> temp)
    {
        if(sum>target)
           return;
        if(sum==target)
        {
            array.add(new ArrayList<Integer>(temp));
            return ;
        }
        
        for(int j=i;j<candidates.length;j++)
        {
            temp.add(candidates[j]);
            combination(array,candidates,target,j,sum+candidates[j],temp);
            temp.remove(temp.size()-1);
            
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> array = new ArrayList<>();
        combination(array,candidates,target,0,0,new ArrayList<Integer>());
        return array;
    }
}