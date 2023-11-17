package org.yu.farm;

public abstract class Animal implements LifeForm {

    protected Animal(AnimalType species, String name) {
        this.species = species;
        this.name = name;
    }

    // Instance variables
    private final AnimalType species;
    private String name;

    public AnimalType getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    // Methods
    abstract public void makeNoise();

    public void eatUnderYonderTree() {
        System.out.println("Munch Crunch Sluuuurp");
    }

}
