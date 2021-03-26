package AnimalInheritanceDemo;

public class AnimalInheritanceDemo {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.setSpecies("Canine");
        System.out.println("----");
        Animal cat = new Animal();
        cat.setSpecies("Feline");
        System.out.println("----");
        Mammal horse = new Mammal();
        horse.setSpecies("Equine");
        horse.setCanBreathe(true);

//        System.out.println("Dog species: " + dog.getSpecies());
//        System.out.println("Cat species: " + cat.getSpecies());
//        System.out.println("Horse species: " + horse.getSpecies());
    }
}
