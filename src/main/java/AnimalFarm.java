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

        animals.add(    new Horse("Benny")     );
        animals.add(    new Armadillo("Susan")     );
        animals.add(    new Goose("Oliver")     );
        animals.add(    new Horse("Henry")     );
        animals.add(    new Pig("Buster")     );
        animals.add(    new Cow( "Sweet Melissa")     );
        animals.add(    new Pig("Theophanes")     );
    }

}


