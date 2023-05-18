package org.yu.farm;

public class Cat extends Animal {

    protected Cat(String name) {
        super(AnimalType.CAT, name);
    }


    @Override
    public void makeNoise() {
        System.out.println("Mrrrowwrr prrt");
    }

}
