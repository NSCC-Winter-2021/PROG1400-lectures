package AnimalInheritanceDemo;

public class Mammal extends Animal {
    private boolean canBreathe;

    public void setCanBreathe(boolean canBreathe) {
        this.canBreathe = canBreathe;
    }

    public boolean getCanBreathe() {
        return canBreathe;
    }

    public Mammal() {
        this.name = "Mammal";
        this.canBreathe = true;
        this.colour = "White";

        System.out.println("Mammal constructor called.");
    }
}
