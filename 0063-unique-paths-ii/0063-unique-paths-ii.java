class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        
        // AGAR PAHLE HI GRID PE OBSTACLE HAI TO WAYS 0
        if(obstacleGrid[0][0] == 1) return 0;

        // ELSE YAHASE START KRNA HAI
        dp[0][0] = 1;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                // YAHA NAHI AA SAKTE WAYS 0
                if(obstacleGrid[i][j] == 1) dp[i][j] = 0;

                // FREE CELLS YAHA 2 WAYS SE AA SAKTE HAI UPAR SE AND NICHE SE
                else{
                    if(i > 0) dp[i][j] += dp[i-1][j];
                    if(j > 0) dp[i][j] += dp[i][j-1];
                }
            }
        }

        return dp[n-1][m-1];
        
    }
}