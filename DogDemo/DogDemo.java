package DogDemo;

class Canine {

    private String name;
    public String breed;
    boolean isHungry;

    void print() {
        System.out.printf("Name: %s, Breed: %s\n", name, breed);
    }

    void changeName(String newName) {
        name = newName;
    }

    String getName() {
        return name;
    }
}

public class DogDemo {

    public static void printCanine(Canine dog) {
        System.out.printf("Name: %s, Breed: %s\n", dog.getName(), dog.breed);
    }

    public static void main(String[] args) {

        Canine spot = new Canine(); // an object called 'spot'
        spot.changeName("Spot");
        spot.breed = "wolf";
        spot.isHungry = false;
        spot.print();

        Canine scruffy = new Canine(); // an object called 'scruffy'
        scruffy.changeName("Scruffy");
        scruffy.breed = "Mutt";
        scruffy.isHungry = true;
        scruffy.print();

        Canine[] pound = {spot, scruffy};

        for (int i = 0; i < pound.length; i++) {
            pound[i].print();
        }
    }
}
