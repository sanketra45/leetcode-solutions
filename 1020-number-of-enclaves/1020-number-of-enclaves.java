class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i = 0; i<m; i++)
        {
            if(grid[i][0] == 1)
            {
                bfs(grid, i, 0);
            }

            if(grid[i][n - 1] == 1){
                bfs(grid, i, n - 1);
            }
        }

        for(int j = 0; j<n; j++)
        {
            if(grid[0][j] == 1){
                bfs(grid, 0, j);
            }

            if(grid[m - 1][j] == 1)
            {
                bfs(grid, m - 1, j);
            }
        }

        for(int i = 0; i<m ; i++)
        {
            for(int j = 0; j< n; j++)
            {
                if(grid[i][j] == 1)
                {
                    count++;
                }
            }
        }

        return count;
    }

    private void bfs(int[][] grid, int row, int cols)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {row, cols});

        while(!queue.isEmpty())
        {
            int[] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];

            if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) continue;

            grid[i][j] = 2;

            queue.offer(new int[] {i, j + 1});
            queue.offer(new int[] {i, j - 1});
            queue.offer(new int[] {i + 1, j});
            queue.offer(new int[] {i - 1, j});
        }
    }
}