package org.example;

import org.example.products.*;

import java.util.Scanner;

public class Main {

    //Magic Numbers Principle
    public static final int maxSpace = 5000;

    public static void main(String[] args) {
        //Liskov Substitution Principle
        Bakery[] bakery = {new Burger(), new Coffee(), new CaesarSalad(), new Cake(), new Tea()};
        Scanner scanner = new Scanner(System.in);
        listProducts(bakery);
        int space = 0;
        while (true) {
            System.out.println("Введите номер желаемого товара и его количество !через пробел! " +
                    "или введите `end`, если Вы закончили с покупкой. Ограничение - " + maxSpace + " шт. продуктов\n");
            String input = scanner.nextLine();
            if (space >= maxSpace) {
                System.out.println("Место в корзине превысило ограничение!");
                input = "end";
            }
            if ("end".equals(input)) {
                System.out.println("Покупки завершены.");
                basketPrint(bakery);
                break;
            }
            String[] parts = input.split(" ");
            if (parts.length != 2 || (Integer.parseInt(parts[0]) - 1) > bakery.length) {
                System.out.println("Такого товара не существует или Вы ввели больше(меньше) двух чисел. Попробуйте снова! \n");
                continue;
            }
            if (Integer.parseInt(parts[1]) > maxSpace || (space + Integer.parseInt(parts[1]) > maxSpace)) {
                System.out.println("Количество товара превысило ограничение! Доступна возможность купить меньше.");
                continue;
            }
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productVolume = Integer.parseInt(parts[1]);
            space = space + productVolume;
            bakery[productNumber].setVol(productVolume);
        }
    }

    //DRY
    public static void listProducts(Bakery[] bakery) {
        int n = 1;
        System.out.println("Список продуктов: \n");
        for (int i = 0; i < bakery.length; i++) {
            System.out.println(n + ". " + bakery[i]);
            n++;
        }
    }

    //DRY
    public static void basketPrint(Bakery[] bakery) {
        int costProducts = 0;
        System.out.println("Ваша корзина: ");
        for (Bakery bakeries : bakery) {
            if (bakeries.getVol() != 0) {
                costProducts += bakeries.getVol() * bakeries.getPrice();
                System.out.println(bakeries + ": в количестве = " + bakeries.getVol() + " шт." + " цена за шт. = " + bakeries.getPrice() + "руб.");
            }
        }
        System.out.println("Итого: " + costProducts + " руб.");
    }
}