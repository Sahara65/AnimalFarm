package org.yu.farm;

public class Goose extends Animal {

    public Goose(String name) {
        this(AnimalType.GOOSE, name);
    }

    private Goose(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Honk!  Honk!");
    }

}
