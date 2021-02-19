package FridayCookieChallenge;

import java.util.Scanner;

public class FridayCookieChallenge {
    public static void main(String[] args) {

        final int CookiesInABag = 40;
        final int ServingsInABag = 10;
        final int CaloriesInAServing = 300;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of cookies: ");
        int numberOfCookies = s.nextInt();

        int cookiesInAServing = CookiesInABag / ServingsInABag;
        float userServing = (float)numberOfCookies / cookiesInAServing;
        float userCalories = userServing * CaloriesInAServing;

        System.out.printf("There are %.0f calories in %d cookies\n",
                userCalories, numberOfCookies);
    }
}
