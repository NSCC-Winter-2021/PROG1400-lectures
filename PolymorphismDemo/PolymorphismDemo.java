package PolymorphismDemo;

public class PolymorphismDemo {

    public static void main(String[] args) {

        Car car = new Car(180, false);
        car.setColour("Black");
        Plane plane = new Plane(10000);
        plane.setColour("White");
        Boat boat = new Boat(true);
        boat.setColour("Gray");

        Vehicle[] fleet = {car, plane, boat};

        for (Vehicle v: fleet) {
            System.out.println(v);

            v.drive();

            // if it is a boat, check the engine
            if (v instanceof Boat) {
                Boat b = (Boat) v;
                System.out.println(b.isEngineStarted());
            }
        }

        // shouldn't be able to do this
        //Vehicle someVehicle = new Vehicle();
    }

}
