package FridayAcronymChallenge;

import java.util.Scanner;

public class FridayAcronymChallenge {
    public static void main(String[] args) {

        // ask the user for a phrase
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = s.nextLine();

        // capitalize the phrase
        phrase = phrase.toUpperCase();

        // loop through each letter of the phrase
        boolean firstLetter = true;
        for (int i = 0; i < phrase.length(); i++) {

            // use charAt to get first letter of each word
            char letter = phrase.charAt(i);
            if (firstLetter) {

                // the first letter will be either the very first
                // letter or the first letter after a space

                // print out letter followed by a period
                System.out.print(letter + ".");

                firstLetter = false;
            }

            // determine first letters of words after spaces
            if (letter == ' ') {
                firstLetter = true;
            }
        }


        // Joe's idea

        // create a char array to hold the acronym
        int index = 0;
        char[] acronym = new char[phrase.length()];

        // loop through every letter of the phrase
        acronym[index++] = phrase.charAt(0);
        acronym[index++] = '.';
        for (int i = 1; i < phrase.length(); i++) {
            // if letter is space, take next letter and put in array
            if (phrase.charAt(i) == ' ') {
                acronym[index++] = phrase.charAt(i+1);
                acronym[index++] = '.';
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(acronym[i]);
        }
        System.out.println();

        // another idea
        String[] words = phrase.split(" ");
        for (String word: words ) {
            System.out.print(word.charAt(0));
            System.out.print('.');
        }

    }
}
