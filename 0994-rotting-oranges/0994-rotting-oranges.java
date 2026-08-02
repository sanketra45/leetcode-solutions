class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return -1;

        int row = grid.length, cols = grid[0].length;
        int[][] time = new int[row][cols];
        
        for(int i = 0; i < row; i++)
        {
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }

        int maxTime = 0;

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(grid[i][j] == 2)
                {
                    dfs(grid, i, j, time, 0);
                }
            }
        }

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(grid[i][j] == 1)
                {
                    if(time[i][j] == Integer.MAX_VALUE) return -1;
                    maxTime = Math.max(maxTime, time[i][j]);
                }
            }
        }

        return maxTime;
    }

    private void dfs(int[][] grid, int i, int j, int[][] time, int currTime)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || currTime >= time[i][j] || grid[i][j] == 0) return;

        time[i][j] = currTime;

        dfs(grid, i, j + 1, time, currTime + 1);
        dfs(grid, i, j - 1, time, currTime + 1);
        dfs(grid, i - 1, j, time, currTime + 1);
        dfs(grid, i + 1, j, time, currTime + 1);
    }
}