public abstract class Animal {

    public Animal(AnimalType species, String name) {
        this.species = species;
        this.name = name;
    }

    // Instance variables
    private AnimalType species;
    private String name;

    public AnimalType getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    // Methods
    abstract public void makeNoise();

    public void eatUnderYonderTree() {
        System.out.println("Munch Crunch Sluuuurp");
    }

}
