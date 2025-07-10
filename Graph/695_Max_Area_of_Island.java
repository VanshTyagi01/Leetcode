class Solution {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int area = dfs(grid, i, j);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>= grid[0].length || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 0;
        return 1 + dfs(grid, i+1, j) + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i, j-1);

    }
}