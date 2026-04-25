import java.util.Random;

public class TicTacToeApp {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';

            System.out.println("You won the toss!");
            System.out.println("You play first.");
            System.out.println("Your symbol: " + humanSymbol);
            System.out.println("Computer symbol: " + computerSymbol);

        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';

            System.out.println("Computer won the toss!");
            System.out.println("Computer plays first.");
            System.out.println("Your symbol: " + humanSymbol);
            System.out.println("Computer symbol: " + computerSymbol);
        }
    }
}