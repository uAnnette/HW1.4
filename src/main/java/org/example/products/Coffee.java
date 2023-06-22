package org.example.products;

import org.example.Bakery;
import org.example.Delivery;

public class Coffee extends Bakery implements Delivery {
    protected String name = "Кофе";
    protected int price = 65;

    public int getPrice() {
        return price;
    }

    @Override
    public void startDel() {
        System.out.println("Доставка кофе назначена. Ожидайте");
    }

    @Override
    public String toString() {
        return name;
    }
}
