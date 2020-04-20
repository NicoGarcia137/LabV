package com.company;

public class BeerConsumer extends Thread{
    private String firstname;
    private BeerHouse beerHouse;

    public BeerConsumer(String firstname, BeerHouse beerHouse) {
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


    public int consume() {
        int consumed = (int) (Math.random() * 12) + 2;
        int bought = this.beerHouse.BeerOut(consumed);
        if (consumed == bought) {
            System.out.println("Consumidor " + this.firstname + ": Tomo " + consumed + " cervezas.");
        } else {
            System.out.println("Consumidor " + this.firstname + ": Existencias Disponibles" + bought + " .");

        }
        return bought;
    }
    @Override
    public void run() {
        while (this.beerHouse.isFlag()) {
            this.consume();
        }
        System.out.println(" Hasta aca llegue ");
    }
}