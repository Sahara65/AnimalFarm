package org.yu.farm.scary;

import org.yu.farm.Animal;
import org.yu.farm.AnimalType;

public class ScaryAnimal extends Animal {
    public ScaryAnimal(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("OAWHoooooooooooooooOOO!");

    }
}
