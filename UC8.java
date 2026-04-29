import java.util.Scanner;

public class TicTacToeGameLoop {

    // Method to display board
    public static void displayBoard(char[][] board) {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

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

        // Check diagonals
        if ((board[0][0] == player &&
             board[1][1] == player &&
             board[2][2] == player) ||

            (board[0][2] == player &&
             board[1][1] == player &&
             board[2][0] == player)) {

            return true;
        }

        return false;
    }

    // Method to check draw
    public static boolean isDraw(char[][] board) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create board
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;

        // Game loop
        while (!gameOver) {

            displayBoard(board);

            System.out.println("Player " + currentPlayer + " Turn");

            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = sc.nextInt();

            // Check if cell is empty
            if (board[row][col] == ' ') {

                board[row][col] = currentPlayer;

                // Check winner
                if (checkWinner(board, currentPlayer)) {

                    displayBoard(board);

                    System.out.println("Player " + currentPlayer + " Wins!");

                    gameOver = true;
                }

                // Check draw
                else if (isDraw(board)) {

                    displayBoard(board);

                    System.out.println("Game Draw!");

                    gameOver = true;
                }

                // Switch turn
                else {

                    if (currentPlayer == 'X') {
                        currentPlayer = 'O';
                    } else {
                        currentPlayer = 'X';
                    }
                }

            } else {

                System.out.println("Cell already occupied! Try again.");
            }
        }

        sc.close();
    }
}