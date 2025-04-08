class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> colSet = new HashSet<>();
        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character>[] squareSet = new HashSet[9];
        for (int i = 0; i < 9; i++) squareSet[i] = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            colSet = new HashSet<>();
            rowSet = new HashSet<>();
            for (int col = 0; col < board.length; col++) {
               if (board[row][col] != '.' && !rowSet.add(board[row][col])) return false; 
               if (board[col][row] != '.' && !colSet.add(board[col][row])) return false;

               if (board[row][col] != '.') {
                int boxIdx = (row / 3) * 3 + (col / 3);
                if (!squareSet[boxIdx].add(board[row][col])) return false;
               }
               
            }
        }
        
        return true;
    }
}
