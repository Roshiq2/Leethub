class Solution {
    public boolean exist(char[][] board, String word) {
        int idx=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(idx)){
                    if(dfs(i,j,word,idx,board)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, String word, int idx,char[][] board){
        if(idx==word.length()){
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return false;
        }
        if(board[i][j] != word.charAt(idx) ){
            return false;
        }
        idx++;
        char temp = board[i][j];
        board[i][j] = '#';  
        boolean found=(dfs(i+1,j,word,idx,board) || dfs(i,j+1,word,idx,board) || dfs(i,j-1,word,idx,board) || dfs(i-1,j,word,idx,board));
       
        board[i][j] = temp; 
        return found;
    }
}