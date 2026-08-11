class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for(int n : nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>=k)
            {
                ls.add(entry.getKey());
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        return list.stream().limit(k).mapToInt(entry -> entry.getKey()).toArray();
       
        // return ls.stream().mapToInt(Integer::intValue).toArray();

        
    }
}