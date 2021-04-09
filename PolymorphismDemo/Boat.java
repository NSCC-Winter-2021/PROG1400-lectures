package PolymorphismDemo;

public class Boat extends Vehicle {

    private boolean hasEngine;
    private boolean engineStarted;

    Boat(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    @Override
    public String toString() {
        return String.format("Colour: %s, Engine: %b\n",
                colour, hasEngine);
    }

    @Override
    public void drive() {
        System.out.println("Smooth sailing...");
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    @Override
    public void setColour(String colour) {

    }
}
