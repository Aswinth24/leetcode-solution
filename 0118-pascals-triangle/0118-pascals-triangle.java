class Solution {
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> array=new ArrayList<>();
        array.add(new ArrayList<>(Arrays.asList(1)));
        for(int i=1;i<n;i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++)
            {
                temp.add(array.get(i-1).get(j-1)+array.get(i-1).get(j));
            }
            temp.add(1);
            array.add(temp);
        }
        return array;
    }
}