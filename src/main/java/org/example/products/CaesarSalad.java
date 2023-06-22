package org.example.products;

import org.example.Bakery;
import org.example.Delivery;
import org.example.Ingredients;

//Interface Segregation Principle
//Dependency Inversion Principle
public class CaesarSalad extends Bakery implements Delivery, Ingredients {
    protected String name = "Салат Цезарь";
    protected int price = 89;

    public int getPrice() {
        return price;
    }

    @Override
    public void startDel() {
        System.out.println("Доставка салата Цезарь назначена. Ожидайте");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void specialIngredients() {
        System.out.println("В этот салат добавлены креветки!");
    }
}
