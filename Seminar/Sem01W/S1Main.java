/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:55:00

Задача 1

Вариант-2 c разбивкой кода по отдельным файлам:
    ● S1Main
    ● S1Product
    ● S1VendingMachine

Данный вариант позволяет запустить код в VSCode, 
только через кнопку Run Java

Решение
 */

package OOP.Seminar.Sem01W;
/*
* Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
* содержащий в себе методы initProducts (List <Product>)
* сохраняющий в себе список исходных продуктов и getProduct(String name) 
*/
import java.util.ArrayList;

public class S1Main {

    public static void main(String[] args) {
        ArrayList<S1Product> prods = new ArrayList<>();
        prods.add(new S1Product("Хлеб", 40.0));
        prods.add(new S1Product("Молоко", 80.0));
        prods.add(new S1Product("Колбаса", 120.0));
        prods.add(new S1Product("Сыр", 150.0));
        
        S1VendingMachine vendingMachine = new S1VendingMachine();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Сыр"));
    }
}
