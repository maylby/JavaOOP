/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496


00:55:00

Задача 1
(Вариант-2 c разбивкой кода по отдельным файлам)
Данный вариант позволяет запустить код в VSCode, 
только через кнопку Run Java

Решение
(Сергей Пономарев)
 */
package OOP.Seminar.Sem01W;

import java.util.ArrayList;
/*
 * Передача списка продуктов с их стоимостью торговой машине
 */
public class S1VendingMachine {
        private ArrayList<S1Product> products;
    
    public void initProducts(ArrayList<S1Product> products){
        this.products = products;
    }
    
    public S1Product getProduct(String prodName, int volume){
        for (S1Product p : products) {
            if (p.getName().equals(prodName)){
                return p;
            }
        }
        return null;
    }
}
