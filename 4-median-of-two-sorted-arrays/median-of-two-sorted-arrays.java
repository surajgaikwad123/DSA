class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] result = new int [nums1.length + nums2.length];
        int k =0;
        for(int i : nums1)
        {
            result[k++] = i;
        }
        for(int i : nums2)
        {
            result[k++] = i;
        }
        double j = k;

        Arrays.sort(result);
        int n = result.length;

        if(n % 2 == 1)
        {
            return result[n/2];
        }
        else
        {
            return (result[n/2-1]+ result [n/2])/2.0;
        }   
    }
}