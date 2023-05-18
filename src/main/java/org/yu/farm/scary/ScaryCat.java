package org.yu.farm.scary;

import org.yu.farm.Cat;

public final class ScaryCat extends Cat {
    public ScaryCat(String name) {
        super(name);
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Scary Cat has bitten the hand that feeds it!!!!!");
    }
}
