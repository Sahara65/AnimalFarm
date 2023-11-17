package org.yu.farm;

import org.yu.farm.scary.Armadillo;
import org.yu.farm.scary.Jaguar;
import org.yu.farm.scary.ScaryCat;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {

    // Member variables
    private List<Animal> animals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }


    // Constructor
    public AnimalFarm() {

        // ALL Animals are welcome at Animal Farm
        // Even Scary ones.

        animals.add(    new Horse("Benny")     );
        animals.add(    new Armadillo("Susan")     );
        animals.add(    new Goose("Oliver")     );
        animals.add(    new Horse("Henry")     );
        animals.add(    new Pig("Buster")     );
        animals.add(    new Cow( "Sweet Melissa")     );
        animals.add(    new Pig("Theophanes")     );
        animals.add(    new Cat("Bai-Bai")      );
        animals.add(    new Jaguar("Bob the not so Bad")  );
        animals.add(    new ScaryCat("Zoe (Not really bad; just a little scary)"));
    }

}


