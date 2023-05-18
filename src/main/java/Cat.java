public class Cat extends Animal {

    public Cat(String name) {
        this(AnimalType.CAT, name);
    }

    private Cat(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mrrrowwrr prrt");
    }

}
