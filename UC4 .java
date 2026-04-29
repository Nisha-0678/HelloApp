import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    static char[][] board = new char[3][3];

    static char userSymbol;
    static char computerSymbol;
    static String currentPlayer;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initializeBoard();
        tossForFirstPlayer();

        printBoard();

        int slot = getUserInput();

        // Convert slot to row and column
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Row Index: " + row);
        System.out.println("Column Index: " + col);
    }

    // Initialize board
    static void initializeBoard() {

        for(int row = 0; row < 3; row++) {

            for(int col = 0; col < 3; col++) {

                board[row][col] = '-';
            }
        }
    }

    // Toss for first player
    static void tossForFirstPlayer() {

        Random random = new Random();

        int toss = random.nextInt(2);

        if(toss == 0) {

            currentPlayer = "User";
            userSymbol = 'X';
            computerSymbol = 'O';

        } else {

            currentPlayer = "Computer";
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println(currentPlayer + " plays first!");
        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    // Read user input
    static int getUserInput() {

        System.out.print("Enter a slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot;
    }

    // Print board
    static void printBoard() {

        System.out.println("-------------");

        for(int row = 0; row < 3; row++) {

            System.out.print("| ");

            for(int col = 0; col < 3; col++) {

                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }
}