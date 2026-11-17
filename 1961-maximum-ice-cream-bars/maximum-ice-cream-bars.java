class Solution {
    public int maxIceCream(int[] costs, int coins) 
    {
        int count = 0;
        int total =0;

        Arrays.sort(costs);

        for(int i=0; i<costs.length; i++)
        {
            if(total + costs[i] <= coins)
            {
                total = total + costs[i];
                count++;
            }
        }
        if(costs[0]>coins)
        {
            count = 0;
        }

        return count;
    }
}