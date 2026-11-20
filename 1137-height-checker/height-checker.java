class Solution {
    public int heightChecker(int[] heights) {
        

        int og [] = heights.clone();
        Arrays.sort(heights);
        int count = 0;
        for(int i=0; i< og.length; i++)
        {
            if(heights[i]!=og[i])
            {
                count++;
            }
        }

        return count;
    }
}