package org.example.products;

import org.example.Bakery;
import org.example.Delivery;

public class Cake extends Bakery implements Delivery {
    protected String name = "Торт";
    protected int price = 140;

    public int getPrice() {
        return price;
    }

    @Override
    public void startDel() {
        System.out.println("Доставка торта назначена. Ожидайте");
    }

    @Override
    public String toString() {
        return name;
    }
}
