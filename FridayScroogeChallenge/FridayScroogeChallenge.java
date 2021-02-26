package FridayScroogeChallenge;

public class FridayScroogeChallenge {

    public static void main(String[] args) {

        Employee bob = new Employee();
        bob.name = "Bob";
        bob.pay = 10.0;

        Employee tim = new Employee();
        tim.name = "Tiny Tim";
        tim.pay = 1.0;

        Employee[] employees = {bob, tim};

        Company scroogeAndMarley = new Company();
        scroogeAndMarley.employees = employees;

        scroogeAndMarley.PrintEmployeesInfo();
        scroogeAndMarley.GiveLazyEmployeesRaiseThatTheyDontDeserve(10);
        scroogeAndMarley.PrintEmployeesInfo();

    }
}
