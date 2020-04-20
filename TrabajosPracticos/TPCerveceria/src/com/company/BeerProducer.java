package com.company;

public class BeerProducer extends Thread{
    private String firstname;
    private BeerHouse beerHouse;

    public BeerProducer(String firstname, BeerHouse beerHouse) {
        super();
        this.firstname = firstname;
        this.beerHouse = beerHouse;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public BeerHouse getBeerHouse() {
        return beerHouse;
    }

    public void setBeerHouse(BeerHouse beerHouse) {
        this.beerHouse = beerHouse;
    }

    public int produce() throws InterruptedException {
        int produced = (int) (Math.random() * 15) + 2;
        this.beerHouse.produceBeer(produced);
        System.out.println("Fabricante " + this.firstname + ": Entrega de :" + produced + " cervezas a BeerHouse.");
        return produced;
    }
    @Override
    public void run() {
        while (this.beerHouse.isFlag()) {
            try {
                this.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sin Existencias.");
    }
}
