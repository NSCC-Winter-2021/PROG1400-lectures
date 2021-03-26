package AnimalInheritanceDemo;

public class Animal {
    protected String name;
    private String species;
    private String genus;
    protected String colour;

    public void setSpecies(String species) {
        this.genus = species;
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public Animal() {
        this.name = "Animal";
        this.colour = "Black";

        System.out.println("Animal constructor called.");
    }
}
