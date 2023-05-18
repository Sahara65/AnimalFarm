public class Hen extends Animal {

    public Hen(String name) {
        this(AnimalType.HEN, name);
    }

    private Hen(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Shimmy-Shack!");
    }

}
