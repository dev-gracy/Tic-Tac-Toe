import java.util.Scanner;

public class TicTacToeApp {

    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // UC3: take input
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }
}