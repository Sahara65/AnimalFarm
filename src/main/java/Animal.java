public class Animal {

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
    public void makeNoise() {

        switch(species){
            case CAT -> System.out.println("Meow");
            case DUCK -> System.out.println("Quack");
            case COW -> System.out.println("Mooo");
            case HORSE -> System.out.println("Nay");
            default -> System.out.println("whaaaa");

        }

    }

    public void eatUnderYonderTree() {
        System.out.println("Munch Crunch Sluuuurp");
    }

}
