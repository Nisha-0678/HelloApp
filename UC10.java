import java.util.Scanner;

public class TicTacToeDraw {

    // Method to check draw condition
    public static boolean isDraw(char[][] board) {

        // Traverse the board
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                // If empty cell exists, game is not draw
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        // No empty cells found
        return true;
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

        // Sample full board with no winner
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        // Display board
        displayBoard(board);

        // Check draw condition
        if (isDraw(board)) {
            System.out.println("The game is a Draw!");
        } else {
            System.out.println("Moves are still available.");
        }
    }
}