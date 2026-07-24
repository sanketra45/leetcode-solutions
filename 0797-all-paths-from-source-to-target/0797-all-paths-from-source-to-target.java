class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        path.add(0);
        dfs(graph, result, path, 0);

        return result;
    }

    private void dfs(int[][] graph, List<List<Integer>> result, List<Integer> path, int node)
    {
        if(node == graph.length - 1)
        {
            result.add(new ArrayList<>(path));
        }

        for(int neighbor : graph[node])
        {
            path.add(neighbor);
            dfs(graph, result, path, neighbor);
            path.remove(path.size() - 1);
        }
    }
}