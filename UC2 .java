import java.util.Random;

class TicTacToe {

    static char[][] board = new char[3][3];

    static char userSymbol;
    static char computerSymbol;
    static String currentPlayer;

    public static void main(String[] args) {

        initializeBoard();
        tossForFirstPlayer();

        printBoard();
    }

    // Initialize board with '-'
    static void initializeBoard() {

        for(int row = 0; row < 3; row++) {

            for(int col = 0; col < 3; col++) {

                board[row][col] = '-';
            }
        }
    }

    // Toss to decide first player and symbols
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