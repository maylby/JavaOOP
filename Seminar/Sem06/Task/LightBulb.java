/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

01:33:00

Dependency Inversion Principle (Принцип инверсии зависимостей)
 */
package OOP.Seminar.Sem06.Task;

/*
 * Здесь класс Switch жестко зависит от класса LightBulb, нарушая DIP. 
 * Чтобы следовать DIP, зависимость должна быть инвертирована 
 * с использованием интерфейсов или абстракций.
 * Примеры демонстрируют нарушение каждого из принципов SOLID на языке Java. 
 * 
 * Чтобы улучшить код и соблюсти принципы SOLID, следует 
 * рассмотреть возможности рефакторинга. 
 */
public class LightBulb {
    public void turnOn() {
        // Включение лампочки
    }
    
    public void turnOff() {
        // Выключение лампочки
    }
    }
    
class Switch {
    private LightBulb bulb;
    
    public Switch() {
        this.bulb = new LightBulb();
    }
    
    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
    }
}
