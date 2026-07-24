class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        // BHAI IS PROBLEM ME HAME DEKHNA HAI KI SOURCE SE DESTINATION JA SAKTE HAI KI NHI
        // ISKE LIYE PAHLE HUM SOURCE SE DFS TRAVERSAL KRENGE AND DEKHENGE IS HAMNE DESTINATION VISIT KIYA YA NHI 

        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++)
        {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges)
        {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        dfs(graph, visited, source);

        return visited[destination];
    }

    private void dfs(List<List<Integer>> graph, boolean[] visited, int node)
    {
        visited[node] = true;

        for(int neighbor : graph.get(node))
        {
            if(!visited[neighbor]){
                dfs(graph, visited, neighbor);
            }
        }
    }
}