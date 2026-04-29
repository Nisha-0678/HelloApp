public class TicTacToe {

    public static void placeMove(char[][] board, int row, int col, char symbol) {
        // Assumes the move is already validated (UC5)
        board[row][col] = symbol;
    }

    // Helper method to print the board (for testing)
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', ' '},
            {' ', 'X', ' '},
            {'O', ' ', ' '}
        };

        // Place move
        placeMove(board, 1, 0, 'O');

        // Display updated board
        printBoard(board);
    }
}