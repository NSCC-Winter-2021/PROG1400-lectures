package Strings;

public class Strings {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String paragraph = """
                This is a story about a man named Jed.
                A poor mountaineer. Barely kept his family fed.""";

        System.out.println(str1);
        System.out.println(paragraph);

        String str2 = str1.toUpperCase();
        System.out.println(str2);

        System.out.println("Length: " + str2.length());
        System.out.println("Char: " + str2.charAt(6));

        double money = 123.45678;
        String moneyString = String.format("USD: $%.2f, $%.3f", money, money);
        System.out.println(moneyString);
    }
}
