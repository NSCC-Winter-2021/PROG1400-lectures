package Doubles;

import java.util.Scanner;

public class DoublesGame {

    private Die die1;
    private Die die2;
    private int money;

    DoublesGame(int money) {
        this.money = money;
        die1 = new Die();
        die2 = new Die();
    }

    private void rollTheDice() {
        die1.Roll();
        die2.Roll();

        System.out.printf("You rolled: %d and %d\n", die1.getValue(), die2.getValue());
    }

    private void checkForWin() {
        if (die1.getValue() == die2.getValue()) {
            System.out.println("You WON!!");
            money += 40;
        } else {
            System.out.println("You LOSE....");
            money -= 20;
        }
    }

    public void Run() {

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("The Game Begins!");
        do {
            rollTheDice();
            checkForWin();

            // determine if the player still has money
            if (money > 0) {
                System.out.println("You now have $" + money);

                // if they have money, they can play again
                System.out.print("Play again? (y/n) ");
                input = scanner.nextLine();
            } else {
                // if they don't have money, the can't play
                input = "n";
            }

        } while (input.equals("y"));
        System.out.println("The Game Ends...");

    }
}
