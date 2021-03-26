package Overloading;

import java.util.Random;

class GlobalVariables {
    // try to avoid at all costs
    public static int magicNumber;
}

class Person {

    // member variables
    // they describe the class
    private String name;
    private int age;
    protected int distanceWalkedInLifeTime;
    //  not a good member variable
    private int counter;
    private int i;

    public Person() {

    }

    public Person(String name, int age) {
        System.out.println("Person 2-arg constructor called.");
        this.name = name;
        this.age = age;
    }

    public Person(Person person)  {
        this(person.name, person.age);
        System.out.println("Person copy constructor called.");
        person.age += 2;
    }

    public Person(String hairColour, int numLegs, String accent) {
        System.out.println("Person 3-arg constructor called.");
        GlobalVariables.magicNumber = 12345;
    }

    public void walk() {
        Random r = new Random();
        int distanceWalked = r.nextInt();
        distanceWalkedInLifeTime += distanceWalked;
        System.out.println("Person walk called.");
    }

    public void walk(int milesWalked) {
        distanceWalkedInLifeTime += milesWalked;
    }

};

class Student extends Person {

    private String id;

    public Student(String name, int age) {
        super( "Brown", 2, "Spanish");
        id = "W123456";
        System.out.println("Student 2-arg constructor called.");
    }

    public Student(Student student) {
        super(student);
        System.out.println("Student copy constructor called.");
        this.id = student.id;
    }

    public void walk() {
        distanceWalkedInLifeTime += 1;
        System.out.println("Student walk called.");
    }

    @Override
    public void walk(int milesWalked) {
    }
}

public class OverloadingDemo {

    public static void main(String[] args) {

        //Person joe = new Person();

        Person bob = new Person("Bob", 89);
        //bob.walk();
        //bob.walk(123);
        System.out.println("---");
        Student ann = new Student("Ann", 23);
        //ann.walk();
        System.out.println("---");

        Person bob2 = new Person(bob);
        System.out.println("---");

        Student ann2 = new Student(ann);
    }
}
