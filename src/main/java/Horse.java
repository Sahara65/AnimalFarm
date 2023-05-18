public class Horse extends Animal {

    public Horse (String name){
        this(AnimalType.HORSE, name);
    }

    private Horse(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("pflWhheeeeea");
    }
}
