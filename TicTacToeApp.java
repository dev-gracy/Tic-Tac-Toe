public class TicTacToeApp {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println("=== Testing UC9: Check Winning Condition ===\n");

        // Test 1: Row win
        System.out.println("Test 1: X wins with row");
        board[0][0] = 'X'; board[0][1] = 'X'; board[0][2] = 'X';
        printBoard();
        System.out.println("X has won: " + hasWon('X') + "\n");

        // Test 2: Column win
        System.out.println("Test 2: O wins with column");
        resetBoard();
        board[0][1] = 'O'; board[1][1] = 'O'; board[2][1] = 'O';
        printBoard();
        System.out.println("O has won: " + hasWon('O') + "\n");

        // Test 3: Diagonal win (top-left to bottom-right)
        System.out.println("Test 3: X wins with diagonal");
        resetBoard();
        board[0][0] = 'X'; board[1][1] = 'X'; board[2][2] = 'X';
        printBoard();
        System.out.println("X has won: " + hasWon('X') + "\n");

        // Test 4: No win yet
        System.out.println("Test 4: No winner yet");
        resetBoard();
        board[0][0] = 'X'; board[1][1] = 'O'; board[2][2] = 'X';
        printBoard();
        System.out.println("X has won: " + hasWon('X'));
        System.out.println("O has won: " + hasWon('O'));
    }

    static void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC9: Check Winning Condition
    // Detects if a player has won the game
    static boolean hasWon(char symbol) {
        // Check all rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol && 
                board[row][1] == symbol && 
                board[row][2] == symbol) {
                return true;
            }
        }

        // Check all columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == symbol && 
                board[1][col] == symbol && 
                board[2][col] == symbol) {
                return true;
            }
        }

        // Check diagonal (top-left to bottom-right)
        if (board[0][0] == symbol && 
            board[1][1] == symbol && 
            board[2][2] == symbol) {
            return true;
        }

        // Check diagonal (top-right to bottom-left)
        if (board[0][2] == symbol && 
            board[1][1] == symbol && 
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }
}