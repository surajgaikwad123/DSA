class Solution {
    public int singleNumber(int[] nums) {


        int r = 0;

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for( int i:nums)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                r = entry.getKey();
                break;
            }
        }
        return r; 
        
    }
}