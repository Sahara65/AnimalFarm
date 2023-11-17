package org.yu.farm;

public class Duck extends Animal {

    public Duck(String name) {
        this(AnimalType.DUCK, name);
    }

    private Duck(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Quack!  Quack!");
    }

}
