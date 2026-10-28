class Solution {
    public int singleNumber(int[] nums) {

        long j = 0;
        Map<Integer, Long> map = new HashMap<>();

        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i,0l)+1);
        }

        for(Map.Entry<Integer,Long> entry : map.entrySet())
        {
            if(entry.getValue()== 1)
            {
                j = entry.getKey();
            }
        }

        int h = (int) j;
        
        return h;
        
    }
    
}