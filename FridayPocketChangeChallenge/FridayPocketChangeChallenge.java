package FridayPocketChangeChallenge;

public class FridayPocketChangeChallenge {
    public static void main(String[] args) {

        Pocket left = new Pocket();
        Pocket right = new Pocket();

        System.out.printf("Left has: $%.2f\n", left.getChange() / 100.0);
        System.out.printf("Right has: $%.2f\n", right.getChange() / 100.0);

        int l = left.getChange();
        int r = right.getChange();
        if (l > r) {
            System.out.println("Left wins!");
        } else if (r > l) {
            System.out.println("Right wins!");
        } else if ((r == l) && (r > 0)) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("You are dead broke....you are the loser!");
        }
    }
}
