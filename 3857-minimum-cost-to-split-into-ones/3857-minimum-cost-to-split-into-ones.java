class Solution {
    public int minCost(int n) {


        // THIS CAN BE SOLVED USING BOTH THE WAYS USING DP SERIES AND USING MATHS


        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++)
        {
            dp[i] = dp[i - 1] + i;
        }

        return dp[n - 1];


        // return n * (n - 1) / 2;
    }
}