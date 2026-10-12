class Solution {
    public int maxProfit(int[] prices, int fee) {

        // IS PROBLEM KO SOLVE KRNE KE LIYE HUM EK 2D DP ARRAY BANAYENGE
        // HAR STOCK KE LIYE STORE KRENGE 
        // DP[i][0] = MAX PROFIT JAB HAMARE PAAS KOI STOCK NHI HAI YA JO THA WO BECH DIYA
        // DP[i][1] = MAX PROFIT JAB HAMARE PAAS EK STOCK HAI YA AGR NHI THA TO KHAREED LIYA

        int n = prices.length;
        int[][] dp = new int[n][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for(int i = 1; i < n; i++)
        {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[n - 1][0];
    }
}