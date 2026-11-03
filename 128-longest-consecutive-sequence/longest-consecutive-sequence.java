class Solution {
    public int longestConsecutive(int[] nums) {

        int max =1;
        int curr = 1;
        Arrays.sort(nums);

        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i -1] == nums[i])
            {
                continue;
            }
            else if(nums[i] == nums[i-1]+1)
            {
                curr++;
            }
            else
            {
                max = Math.max(curr,max);
                curr=1;
            }
            
        }

        max =Math.max(curr,max);

        if(nums == null || nums.length == 0)
        {
            max = 0;
        }
        return max;
        
    }
}