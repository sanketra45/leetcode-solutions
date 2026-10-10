class Solution {
    public int minCostClimbingStairs(int[] cost) {

//  IS PROBLEM ME HAM MIN COST TO REACH EACH INDEX NIKALENGE AND USE STORE KRENGE DP ARRAY ME 
//  LAST KE DO ELEMENTS KA MIN MATLAB HAMARA RESULT (LAST 2 ELEMENTS SE HAM ARRAY KE BAHAR JA SAKTE HAI)

        int n = cost.length;
        int[] dp = new int[n];

        if(n == 1) return cost[0];
        if(n == 2) return Math.min(cost[0], cost[1]);

        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i = 2; i < n; i++)
        {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        return Math.min(dp[n - 1], dp[n - 2]);
    }
}