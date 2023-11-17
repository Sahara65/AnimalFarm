package org.yu.farm;

public class Cat extends Animal {

    public Cat(String name) {
        super(AnimalType.CAT, name);
    }


    @Override
    public void makeNoise() {
        System.out.println("Mrrrowwrr prrt");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Purrr nom nom");
    }
}
