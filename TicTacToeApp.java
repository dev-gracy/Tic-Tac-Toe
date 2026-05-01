import java.util.Random;

public class TicTacToeApp {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {
        computerMove();
        printBoard();
    }

    // UC7
    static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1; // 1–9

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}