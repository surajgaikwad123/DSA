class Solution {
    int[][] dirs ={{1,0},{-1,0},{0,1},{0,-1}};
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for(int i=0; i< m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(grid[i][j] > 0 && !visited[i][j])
                {
                    long islandsum = dfs(grid, visited, i, j);
                    
                    if(islandsum % k == 0)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
        
    }

    private long dfs(int[][] grid, boolean[][] visited , int r, int c)
    {
        int m = grid.length;
        int n = grid[0].length;


        if(r<0 || c<0 || r>=m || c>=n || grid[r][c] <= 0 || visited[r][c])
        {
            return 0;
        }

        visited[r][c] = true;
        long sum =grid[r][c];

        for(int [] dir : dirs)
        {
            sum += dfs(grid, visited, r + dir[0], c + dir[1]);
        }
        return sum;
    }
}