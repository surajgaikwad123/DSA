class Solution {
    public boolean check(int[] nums) {
        int [] org = nums.clone();
        Arrays.sort(nums);
        int [] s = new int [nums.length];
        int j =0;
        boolean o = false;

        while(j<nums.length)
        {
            for(int i=0; i<nums.length; i++)
            {
                s[i] = nums[(i+j)% nums.length];
            }

            if(Arrays.equals(org,s))
            {
                o = true;
            }
            j++;
        }     
        return o;   
    }
}