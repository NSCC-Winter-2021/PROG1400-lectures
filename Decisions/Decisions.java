package Decisions;

import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        if (num < -200) {
            System.out.println("Negative.");
        } else
            System.out.println("Checking other stuff.");
            if (num == 0) {
                System.out.println("Zero.");
            } else {
                if (num > 10 && num < 20) {
                    System.out.println("Small Number.");
                } else {
                    if (num > 100 || num < -100) {
                        System.out.println("Big Number.");
                    } else {
                        System.out.println("Positive.");
                    }
                }
            }
    }
}
