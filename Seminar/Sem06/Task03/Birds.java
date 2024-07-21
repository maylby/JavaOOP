/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

01:31:00

Liskov’s Substitution Principle (Принцип подстановки Барбары Лисков)

В данном случае, нарушается принцип LSP 
(Liskov’s Substitution Principle - Принцип подстановки Барбары Лисков), 
так как наследующий класс Ostrich изменяет ожидаемое поведение 
метода fly() базового класса Birds (птицы).

 */
package OOP.Seminar.Sem06.Task03;

// общий класс "Birds" (птицы)
public class Birds {
    String name;    
}

// интерфейс полёта
interface Flying {
    public void fly();
        // Реализация полета птицы
}

// интерфейс бега
interface Runing {
    public void run();
        // Реализация бега птицы
}

/*
 * класс "Ostrich" (страус)
 * наследует класс птиц (Birds),
 * реализует (implements) интерфейс "Runing" (бег) 
 */
class Ostrich extends Birds implements Runing {

    @Override
    public void run() {
    }
}

/*
 * класс "Eegle" (орёл)
 * наследует класс птиц (Birds),
 * реализует (implements) интерфейс "Flying" (полёт) 
 */
class Eegle extends Birds implements Flying {

    @Override
    public void fly() {
    }
}