class Solution {
    int count=0;
    public int totalNQueens(int n) {
        char[][] chessBoard=new char[n][n];
        
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                chessBoard[i][j]='.';
            }
        }
        nQueens(0,chessBoard);
        return count;
    }
    private void nQueens(int row, char[][] chessBoard) {
        int n=chessBoard.length;
        if(row==n){
           count++;
            return;
        }

        for(int col=0;col<n;col++){
            if(canQueenBePlaced(row,col,chessBoard)){
                chessBoard[row][col]='Q';
                nQueens(row+1,chessBoard);
                chessBoard[row][col]='.';
            }
        }
    }

    private boolean canQueenBePlaced(int row, int col, char[][] chessBoard) {
        int n= chessBoard.length;
        // check col
        int i=row-1;  // exclude itself include above rows
        while(i>=0){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
            i--;
        }
        // check left diagonal
         i=row-1;  // exclude itself include above rows
        int j=col-1;
        while(i>=0 && j>=0){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
        // check right diagonal
        i=row-1;  // exclude itself include above rows
        j=col+1;
        while(i>=0 && j<n){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}