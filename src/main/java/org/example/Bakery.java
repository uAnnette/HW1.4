package org.example;

public class Bakery {

    protected String name;
    protected int price;
    protected int vol;

    public int getPrice() {
        return price;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "- " + name;
    }

}
