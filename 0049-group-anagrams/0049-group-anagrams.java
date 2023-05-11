class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> map=new HashMap<>();
        String[] array=new String[strs.length];
        for(int i=0;i<strs.length;i++)
        {   
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            map.putIfAbsent(new String(arr),new ArrayList<String>());
            map.get(new String(arr)).add(strs[i]);   
        }
        return new ArrayList<>(map.values());

        
    }
}