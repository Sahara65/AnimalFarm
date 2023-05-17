public class Pig extends Animal {

    public Pig(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Weeee Weeee Weeee all the way home!");
    }

}
