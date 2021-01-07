package com.titiredennis.curs9;

public interface CarSellService {

    public static final String model = "BMW";

    void sellCar();

    default void resellCar() {
        System.out.println("Resel Car");
        sellCar();
    }
}
