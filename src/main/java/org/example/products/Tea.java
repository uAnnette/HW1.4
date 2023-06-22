package org.example.products;

import org.example.Bakery;
import org.example.Delivery;

//Single Responsibility Principle
public class Tea extends Bakery implements Delivery {
    protected String name = "Чай";
    protected int price = 50;

    public int getPrice() {
        return price;
    }

    @Override //Open Closed Principle
    public void startDel() {
        System.out.println("Доставка чая назначена. Ожидайте");
    }

    @Override
    public String toString() {
        return name;
    }
}
