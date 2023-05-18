public class Armadillo extends Animal {
    public Armadillo(String name) {
        this(AnimalType.ARMADILLO, name);
    }

    public Armadillo(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("shhh.  armadillos are silent...");
    }
}
