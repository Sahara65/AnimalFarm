package org.yu.farm;

public class Armadillo extends Animal {

    public Armadillo(String name) {
        super(AnimalType.ARMADILLO, name);
    }


    @Override
    public void makeNoise() {
        System.out.println("shhh.  armadillos are silent...");
    }
}
