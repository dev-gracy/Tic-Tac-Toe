public class TicTacToeApp {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        // initialize board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // sample move (already validated)
        placeMove(0, 0, 'X');

        // print updated cell (as shown in PDF)
        System.out.println(board[0][0]);
    }

    // UC6 method
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}