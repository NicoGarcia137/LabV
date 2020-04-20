package com.company;

public class Main {

    public static void main(String[] args) {

        BeerHouse beerHouse = new BeerHouse(100);
        BeerConsumer Cachito = new BeerConsumer("Cachito", beerHouse);
        BeerConsumer Pachino = new BeerConsumer("Pachino", beerHouse);
        BeerProducer AntaresFabrica = new BeerProducer("AntaresFabrica", beerHouse);
        BeerProducer GluckFab = new BeerProducer("GLUCKFabrica", beerHouse);

        AntaresFabrica.start();
        Pachino.start();
        Cachito.start();
        GluckFab.start();
    }
}
