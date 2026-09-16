class Solution {
    public long countPairs(int n, int[][] edges) {
        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];
        long ans = 0;
        long total = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                long size = dfs(i, graph, visited);

                ans += size * total;
                total += size;
            }
        }
        return ans;
    }
    private long dfs(int node, ArrayList<Integer>[] graph, boolean[] visited) {
        visited[node] = true;

        long size = 1;

        for (int next : graph[node]) {
            if (!visited[next]) {
                size += dfs(next, graph, visited);
            }
        }
        return size;
    }
}