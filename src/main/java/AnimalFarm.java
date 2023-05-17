import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {


    // Member variables
    private List animals = new ArrayList();

    public List getAnimals() {
        return animals;
    }

    // Constructor
    public AnimalFarm() {

        animals.add(    new Animal(AnimalType.CAT, "Benny")     );
        animals.add(    new Animal(AnimalType.DUCK, "Susan")     );
        animals.add(    new Animal(AnimalType.GOOSE, "Oliver")     );
        animals.add(    new Animal(AnimalType.HEN, "Henry")     );
        animals.add(    new Pig(AnimalType.PIG, "Buster")     );
        animals.add(    new Animal(AnimalType.COW, "Sweet Melissa")     );
        animals.add(    new Pig(AnimalType.PIG, "Theophanes")     );
    }

}


