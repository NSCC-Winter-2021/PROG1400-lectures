package HelloVariable;

public class HelloVariable {

    public final double PI = 3.14159;

    public static void main(String[] args) {

        // constant variables
        final String SecretWord = "secret";

        // declaring a variable and initializing the variable
        String name = "Brian Shewan";

        System.out.println("Hello, " + name);

        // declare a variable
        int num;
        num = 12345;

        System.out.println("num = " + num + "\n");

        double pi = 3.14159;

        System.out.println("pi = " + pi);

        // a constant variable
        final int Number = 12345;

        char letter = 'a' + 10;
        System.out.println(letter);

        // integer rounding
        int num2 = (25 + 50) / 100;
        System.out.println(num2);
    }
}