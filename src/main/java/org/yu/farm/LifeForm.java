package org.yu.farm;

public interface LifeForm {

    public default void eatUnderYonderTree() {
        System.out.println("nom nom");
    }

}
