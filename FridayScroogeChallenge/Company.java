package FridayScroogeChallenge;

public class Company {
    Employee[] employees;

    void GiveLazyEmployeesRaiseThatTheyDontDeserve(int percentage) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].pay += employees[i].pay * percentage / 100;
        }
    }

    void PrintEmployeesInfo() {
        for (Employee e: employees) {
            e.PrintInfo();
        }
    }
}
