import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        AnimalFarm myFarm = new AnimalFarm();
        System.out.println(myFarm);




        List<Animal> animalList = myFarm.getAnimals();




        for (Animal a : animalList) {
            System.out.printf("%s the %s says\n", a.getName(), a.getSpecies());
            a.makeNoise();    // POLYMORPHIC call
            a.eatUnderYonderTree();

        }

    }
}
