package org.yu.farm.scary;

import org.yu.farm.AnimalType;

public final class ScaryCat extends ScaryAnimal {
    public ScaryCat(String name) {
        super(AnimalType.CAT, name);
    }

    @Override
    public void makeNoise() {
        System.out.println("HISSSSSSSSS");
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Scary Cat has bitten the hand that feeds it!!!!!");
    }
}
