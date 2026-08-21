class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int sum = 0;
        List<Integer> ss = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++)
        {
            ss.add(nums[i]);
        }
        int min = Collections.min(ss);
        int max = Collections.max(ss);


        for(int i = min; i<max; i++)
        {
            if(!ss.contains(i))
            {
                result.add(i);
            }
        }

        return result;
        
    }
}