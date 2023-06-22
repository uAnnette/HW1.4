package org.example.products;

import org.example.Bakery;
import org.example.Delivery;

public class Burger extends Bakery implements Delivery {
    protected String name = "Бургер";
    protected int price = 59;

    public int getPrice() {
        return price;
    }

    @Override
    public void startDel() {
        System.out.println("Доставка бургера назначена. Ожидайте");
    }

    @Override
    public String toString() {
        return name;
    }
}
