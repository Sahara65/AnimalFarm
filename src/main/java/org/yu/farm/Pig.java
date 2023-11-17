package org.yu.farm;

public class Pig extends Animal {

    public Pig(String name) {
        this(AnimalType.PIG, name);
    }

    private Pig(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Weeee Weeee Weeee all the way home!");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("vacuum inhale noises");
    }
}
