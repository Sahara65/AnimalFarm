package org.yu.farm.scary;

import org.yu.farm.Cat;

public class Jaguar extends Cat {

    public Jaguar(String name) {
        super(name);
    }

    @Override
    public void eatUnderYonderTree() {
        System.out.println("Oh dear!  Jaguar is trying to eat Piggy again.");
    }
}
