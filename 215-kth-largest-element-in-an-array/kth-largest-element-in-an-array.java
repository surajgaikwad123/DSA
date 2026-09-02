class Solution {
    public int findKthLargest(int[] nums, int k) {

        int s = nums.length -k;
        int result = 0;

        Arrays.sort(nums);

        for(int i =0; i<nums.length ; i++)
        {
            if(i==s)
            {
                result = nums[i];
            }
        }

        return result;
    }
        
}