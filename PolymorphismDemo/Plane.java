package PolymorphismDemo;

public class Plane extends Vehicle {

    protected int altitude;

    Plane(int altitude) {
        this.altitude = altitude;
    }

    @Override
    public void drive() {
        System.out.println("Flying free!");
    }
}
