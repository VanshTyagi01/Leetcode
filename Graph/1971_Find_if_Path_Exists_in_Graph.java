class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int v = edge[0];
            int u = edge[1];
            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        boolean visited[] = new boolean[n];
        return dfs(visited, graph, source, destination);
    }
    public boolean dfs(boolean[] visited, List<List<Integer>> graph, int currentNode, int dest){
        if(currentNode == dest){
            return true;
        }
        visited[currentNode] = true;
        for(int neighbour: graph.get(currentNode)){
            if(!visited[neighbour]){
                if(dfs(visited, graph, neighbour, dest)){
                    return true;
                }
            }
        }
        return false;
    }
}