/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:55:00

Задача 1

Вариант-2 c разбивкой кода по отдельным файлам
Данный вариант позволяет запустить код в VSCode, 
только через кнопку Run Java

Решение
(Сергей Пономарев)
 */

package OOP.Seminar.Sem01W;
/*
 * Внесение наименования каждого продукта 
 * и его стоимости в общий список
 */
public class S1Product {

    private String name;
    private double cost;

    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public double getCost() {
        return cost;
    }
        
    public void setCost(double cost) {
        this.cost = cost;
    }
        
    public S1Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    
    /*
     * Переопределение метода
     * для выдачи сведений о продукте
     * в понятной потребителю форме
     */
    @Override
    public String toString() {
        return "Product{" +
        "name = '" + name + '\'' +
        ", cost = " + cost +
        '}';
    }

}

