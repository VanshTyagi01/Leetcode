class Solution {
    public int findCircleNum(int[][] isConnected) {
        // isconnected[i][j] = 1 // connrection b/t i and j city
        // isconnected[i][j] = 0 // no connrection b/t i and j city

        int numberOfCities = isConnected.length;  // no of cities
        boolean []visited = new boolean[numberOfCities]; // all fill with false
        int count = 0; // no of proviences
        for(int i=0; i<numberOfCities; i++){
            if(!visited[i]){  //city is not vidited
                dfs(i, isConnected, visited);
                // backtrack
                count++;
            }
        }
        return count;
    }
    void dfs(int currentCity, int[][] isConnected, boolean[] visited){
        visited[currentCity] = true; // mark this as visited
        for(int neighbour = 0; neighbour<isConnected.length; neighbour++){
            if(isConnected[currentCity][neighbour] == 1 && !visited[neighbour]){
                dfs(neighbour, isConnected, visited);
            }
        }
    }
}