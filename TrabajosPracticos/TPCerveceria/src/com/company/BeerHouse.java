package com.company;

public class BeerHouse {

public static int capacityBeer=100 ;
public static int stockBeer;
public static boolean flag;

    public BeerHouse(int stockBeer) {
        this.stockBeer = stockBeer;
        this.flag = true;
    }

    public static int getCapacityBeer() {
        return capacityBeer;
    }

    public static void setCapacityBeer(int capacityBeer) {
        BeerHouse.capacityBeer = capacityBeer;
    }

    public static int getStockBeer() {
        return stockBeer;
    }

    public static void setStockBeer(int stockBeer) {
        BeerHouse.stockBeer = stockBeer;
    }

    public static boolean isFlag() {
        return flag;
    }

    public static void setFlag(boolean flag) {
        BeerHouse.flag = flag;

    }

    public synchronized void produceBeer(int beers) {
        while ((stockBeer + beers) > (this.getCapacityBeer())) {
            System.out.println("Stock Maximo esperando Consumidores....");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setStockBeer(this.getStockBeer() + beers);
        System.out.println("BeerHouse: Birras Producidas " + beers + " ,Stock Remanente de :" + this.getStockBeer() + "/" + this.getCapacityBeer());
    }

    public synchronized int BeerOut(int beers) {
        if (this.getStockBeer() < beers) {
            int sold = this.getStockBeer();
            this.setStockBeer(0);
            this.setFlag(false);
            return sold;
        } else {
            this.setStockBeer(this.getStockBeer() - beers);
            notifyAll();
            return beers;
        }
    }
}

