public class TicTacToeWinner {

    // Method to check winner
    public static boolean checkWinner(char[][] board, char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {

                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] == player &&
                board[1][j] == player &&
                board[2][j] == player) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {

            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {

            return true;
        }

        // No winner found
        return false;
    }

    // Method to display board
    public static void displayBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', 'O', ' '},
                {' ', ' ', ' '}
        };

        // Display board
        displayBoard(board);

        // Check winner
        if (checkWinner(board, 'X')) {
            System.out.println("Player X Wins!");
        } else if (checkWinner(board, 'O')) {
            System.out.println("Player O Wins!");
        } else {
            System.out.println("No Winner Yet.");
        }
    }
}