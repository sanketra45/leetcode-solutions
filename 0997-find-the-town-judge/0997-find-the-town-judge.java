class Solution {
    public int findJudge(int n, int[][] trust) {

        // BHAI IS PROBLEM ME HAME JUDGE FIND KRNA HAI, JUDGE VO HOTA HAI JISKI OUTDEGREE 0 AND INDEGREE N - 1 HOTI HAI
        // MATLAB USKE PAAS SAB AATE HAI BUT VO KISIKE PAAS NHI JATA 

        // ISKE LIYE HAM HAR VERTEX KI INDEGREE AND OUTDEGREE NIKALENGE AND CHECK KRENGE KI VO JUDGE HAI KI NHI

        int[] outdegree = new int[n + 1];
        int[] indegree = new int[n + 1];

        for(int[] edge : trust)
        {
            int start = edge[0];
            int end = edge[1];

            indegree[end]++;
            outdegree[start]++;
        }

        for(int i = 1; i <= n; i++)
        {
            if(indegree[i] == n - 1 && outdegree[i] == 0) return i;
        }

        return -1;
    }
}