package Loops;

public class Loops {
    public static void main(String[] args) {

        int num = 1;
        while (num < 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num < 10);
        System.out.println();

        // print out 34 to 56 by 3
        for (int i=34; i<=56; i+=3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
