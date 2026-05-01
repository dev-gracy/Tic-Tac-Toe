import java.util.Random;

public class TicTacToeApp {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char human = 'X';
    static char computer = 'O';

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                // dummy human move (for now)
                makeMove(0, 0, human);
            } else {
                computerMove();
            }

            printBoard();

            // dummy stop condition (replace later in UC9)
            gameOver = checkGameOver();

            isHumanTurn = !isHumanTurn;
        }
    }

    static void makeMove(int row, int col, char symbol) {
        if (board[row][col] == '-') {
            board[row][col] = symbol;
        }
    }

    static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                board[row][col] = computer;
                break;
            }
        }
    }

    static boolean checkGameOver() {
        // TEMP (UC9 will handle real logic)
        // just stop after few moves to show loop working
        int filled = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != '-') filled++;
            }
        }

        return filled >= 3; // just demo
    }

    static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}