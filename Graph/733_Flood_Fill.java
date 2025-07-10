class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        if(currentColor == color){
            return image;
        }
        // color is different
        dfs(image, sr, sc, currentColor, color);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int orgColor, int newColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != orgColor){
            return;
        }
        image[sr][sc] = newColor;
        dfs(image, sr+1, sc, orgColor, newColor);
        dfs(image, sr-1, sc, orgColor, newColor);
        dfs(image, sr, sc+1, orgColor, newColor);
        dfs(image, sr, sc-1, orgColor, newColor);
    }
}