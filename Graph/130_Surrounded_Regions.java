class Solution {
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i=0; i<rows; i++){
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            if(board[i][cols-1] == 'O'){
                dfs(board, i, cols-1);
            }
        }
        for(int i=0; i<cols; i++){
            if(board[0][i] == 'O'){
                dfs(board, 0, i);
            }
            if(board[rows-1][i] == 'O'){
                dfs(board, rows-1, i);
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(board[i][j] == 'V'){
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }

    }
    public void dfs(char[][] board, int i, int j){
        if(i<0 || j<0 || i>= board.length || j>=board[0].length || board[i][j] != 'O'){
            return;
        }
        board[i][j] = 'V';
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
}