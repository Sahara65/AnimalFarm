package org.yu.farm.scary;

import org.yu.farm.Animal;

public class ScaryAnimalFarm {

    public static void main(String[] args) {
        Animal c = new ScaryCat("Scary Cat");
        c.setName("Good Sweet Fluffy Kitty, Wouldn't hurt a fly.");

        System.out.println((c.getName()));

        // You can change the name, but it's still a ScaryCat
        c.eatUnderYonderTree();

    }
}
