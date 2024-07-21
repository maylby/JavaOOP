/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496


Задача 2 

Вариант-2 
(коды в разных файлах):
    ● Main (вывод результатов)
    ● abstract class Product
    ● interface VendingMachine
    
Решение
(Александр Верзун)

*/
package OOP.Seminar.Sem01W.Task2;
/*
 * Сделать класс Товар абстрактным, 
 * создать нескольких наследников (к примеру: БутылкаВоды), 
 * сделать интерфейсом ТорговыйАвтомат 
 * и реализовать класс какого-то одного типа ТорговогоАвтомата 
 * (пример: ПродающийБутылкиВодыАвтомат
 * 
 * В интерфейсе только getProduct!
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> prods = new ArrayList<>();
        prods.add(new BottleWater("Вода", 40.0));
        prods.add(new BottleWater("Минералка", 60.0));
        prods.add(new BottleWater("Кола", 80.0));
        
        VendMach vendingMachine = new VendMach();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Минералка"));
    }
}


// Windows PowerShell
// (C) Корпорация Майкрософт (Microsoft Corporation)
// Попробуйте новую кроссплатформенную оболочку 
// PowerShell (https://aka.ms/pscore6) 