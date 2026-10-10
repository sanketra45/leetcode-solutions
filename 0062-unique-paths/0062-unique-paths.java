class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // EK DP ARRAY BANAYENGE 
        // HAR INDEX US INDEX TAK POHOCHNE KE LIYE KITNE UNIQUE WAYS HAI WO STORE KREGA
        // LAST INDEX ME TOTAL NO OF UNIQUE WAYS STORE HOGA


        // FIRST COLMN KE ELEMENTS TAK POHOCH NE KE SIRF 1 HI WAY HAI 
        for(int i = 0; i < m; i++) dp[i][0] = 1;

        // FIRST ROW KE ELEMENTS TAK POHOCH NE KE SIRF EK HI WAY HAI
        for(int j = 0; j < n; j++) dp[0][j] = 1;
        
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m-1][n-1];
    }
}