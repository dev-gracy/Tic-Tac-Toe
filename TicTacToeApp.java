public class TicTacToeApp {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        int row = 1;
        int col = 1;

        System.out.println(isValidMove(row, col));
    }

    static boolean isValidMove(int row, int col) {

        // check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // check empty cell
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}