class Solution {
    List<List<Integer>> array = new ArrayList<>();
    public void combination(int[] candidates, int target,int i,int sum,ArrayList<Integer> temp,String check)
    {
        if(sum>target)
           return;
        if(sum==target)
        {
           array.add(new ArrayList<>(temp));
           return;
        }
        for(int j=i;j<candidates.length;j++)
        {
            if(j>i&&candidates[j]==candidates[j-1])continue;
            if(candidates[j]>target)break;
            temp.add(candidates[j]);
            combination(candidates,target,j+1,sum+candidates[j],temp,check+candidates[j]);
            temp.remove(temp.size()-1);
            
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);

        combination(candidates,target,0,0,new ArrayList<Integer>(),"");
        return array;
    }
}