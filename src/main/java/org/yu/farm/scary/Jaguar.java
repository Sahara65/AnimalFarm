package org.yu.farm.scary;

import org.yu.farm.AnimalType;
import org.yu.farm.Cat;

public class Jaguar extends ScaryAnimal {

    public Jaguar(String name) {
        super(AnimalType.CAT, name);
    }

    @Override
    public void makeNoise() {
            System.out.println("RAHHHHHHHHH");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Oh dear!  Jaguar is trying to eat Piggy again.");
    }
}
