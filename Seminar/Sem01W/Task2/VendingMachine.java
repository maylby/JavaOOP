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

public interface VendingMachine {
    
    Object getProduct(String prodName); // "public" - удалил перед "Product"
                                         // вместо скобок "{}", точка с запятой
        // {
        //     for (Product p : products) {
        //         if (p.getName().equals(prodName)){
        //             return p;
        //         }
        //     }
        //     return null;
        // }
    
}
