package PolymorphismDemo;

public class Car extends Vehicle {

    private int tireSize;
    private boolean isDiesel;

    Car(int tireSize, boolean isDiesel) {
        this.tireSize = tireSize;
        this.isDiesel = isDiesel;
    }

    @Override
    public void drive() {
        System.out.println("Zipping down the Autobahn.");
    }
}
