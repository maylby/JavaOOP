/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496/homework

Практическое задание 1

 */
package OOP.Homework.Home01;

import java.util.ArrayList;

public class VendingMachine {
            private ArrayList<Product> products;
    
    public void initProducts(ArrayList<Product> products){
        this.products = products;
    }
    
    public Product getProduct(String prodName){
        for (Product p : products) {
            if (p.getName().equals(prodName)){
                return p;
            }
            /*
             * Как добавить указание объёма (volume) 
             * при вводе заказа в "HotBrinksMachine",
             * не меняя название продукта в заказе???
             * Форма записи ниже не корректна.
             */
            // if (p.getVolume().equals(volume)){
            //     return p;
            // }
        }
        return null;
    }
}
