import java.util.Random;

public class TicTacToe {

    // Reuse from UC5 (validation)
    public static boolean validateMove(char[][] board, int row, int col) {
        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        return board[row][col] == ' ';
    }

    // Reuse from UC6 (placement)
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7: Computer random move
    public static void computerRandomMove(char[][] board, char symbol) {
        Random rand = new Random();
        int row, col;

        while (true) {
            // Generate slot 1–9
            int slot = rand.nextInt(9) + 1;

            // Convert slot to row & column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Validate move
            if (validateMove(board, row, col)) {
                // Place move
                placeMove(board, row, col, symbol);
                System.out.println("Computer placed at slot: " + slot);
                break;
            }
        }
    }

    // Helper to print board
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

        computerRandomMove(board, 'O');
        printBoard(board);
    }
}