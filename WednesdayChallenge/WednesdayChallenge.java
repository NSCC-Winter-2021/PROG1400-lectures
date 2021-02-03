package WednesdayChallenge;

import java.util.Scanner;

public class WednesdayChallenge {
    public static void main(String[] args) {

        // ask user for two numbers
        Scanner s = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        // loop between the two entered numbers
        //System.out.println("You typed: " + num1 + " and " + num2);
        for (int i = num1; i <= num2; i++) {
            System.out.println(i + ": ");
        }

        // for each number in the loop
        // do another loop that starts at 1 and ends at that number
        // ex. 10 should loop between 1 and 10

        // divide the number by each number in the loop
        // use modulus division to see it is evenly divisible

        // if evenly divisible, print out the number

    }
}
