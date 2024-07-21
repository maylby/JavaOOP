/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496/homework

Практическое задание 1

Создать наследника реализованного класса ГорячийНапиток 
с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
и реализовать перегруженный метод getProduct(int name, int volume, int temperature), 
выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

*/

package OOP.Homework.Home01;

import java.util.ArrayList;

public class HotBrinksMachine {
    public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<>();
        prods.add(new Product("Latte", 100, 80, 50.0));
        prods.add(new Product("Latte", 150, 80, 70.0));
        prods.add(new Product("Cappuccino", 100, 80, 60.0));
        prods.add(new Product("Cappuccino", 150, 80, 80.0));
        prods.add(new Product("CoffeeMilk", 100, 60, 50.0));
        prods.add(new Product("CoffeeMilk", 150, 60, 70.0));
        prods.add(new Product("TurkishCoffee", 100, 80, 40.0));
        prods.add(new Product("TurkishCoffee", 150, 80, 55.0));
        prods.add(new Product("BlackTea", 200, 90, 60.0));
        prods.add(new Product("GreenTea", 200, 90, 60.0));
        prods.add(new Product("TeaMilk", 200, 70, 65.0));
        
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.initProducts(prods);
        /*
         * Нужна возможность добавления в заказ данных 
         * об объёме напитка и количестве сахара.
         */
        System.out.println(vendingMachine.getProduct("Latte"));
    }
}
