package StaticDynamicDemo;

class AnotherClass {

    private String name = "John John";
    public String Address = "Somewhere Ave";
    private int numTimesPrintNameWasCalled = 0;
    public static String World = "Earth";

    public int PrintName() {
        System.out.println(name);
        numTimesPrintNameWasCalled++;
        return numTimesPrintNameWasCalled;
    }


    private void printAddress() {
        System.out.println(Address);
        AnotherClass.PrintStaticInfo();
        double num = Math.sqrt(12.34);
    }

    public static void PrintInfo() {
        System.out.println("Another class info.");
    }

    private static void PrintStaticInfo() {
        System.out.println("Another class static info");
    }

}

public class StaticDynamicDemo {

    public void PrintNonStaticStuff() {
        System.out.println("Some Dynamic Stuff");
    }

    public static void PrintStaticStuff() {
        System.out.println("Some Static Stuff");

        StaticDynamicDemo app = new StaticDynamicDemo();
        app.PrintNonStaticStuff();
    }

    public static void main(String[] args) {

        PrintStaticStuff();

        StaticDynamicDemo app = new StaticDynamicDemo();
        app.PrintNonStaticStuff();

        AnotherClass.PrintInfo();
        //AnotherClass.PrintStaticInfo();

        AnotherClass cls = new AnotherClass();
        //cls.PrintAddress();
        //cls.name = "Joe";
        int timesCalled = cls.PrintName();
        cls.Address = "Anywhere Dr.";
        System.out.println(cls.Address);
        System.out.println("Times Called: " + timesCalled);
        timesCalled = cls.PrintName();
        System.out.println("Times Called: " + timesCalled);

        System.out.println((new AnotherClass()).Address);

        System.out.println(AnotherClass.World);
    }
}
