package com.titiredennis.curs9;

public class Main {
    public static void main(String[] args) {
        CarSellService carSellService = new CarSellServiceImpl();
        carSellService.sellCar();

        CarSellService carSellService1 = new CarSellServiceImpl();
        carSellService1.sellCar();
        carSellService1.resellCar();
    }
}
