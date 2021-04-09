package PolymorphismDemo;

public abstract class Vehicle implements Colourable {

    protected int speed;
    protected String colour;

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return colour;
    }

    public abstract void drive();
}
