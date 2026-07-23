class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            if(!visited[i])
            {
                dfs(isConnected, visited, i);
                count++;
            }
        }

        return count;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int node)
    {
        visited[node] = true;

        for(int i = 0; i < isConnected.length; i++)
        {
            if(isConnected[node][i] == 1 && !visited[i])
            {
                dfs(isConnected, visited, i);
            }
        }
    }
}