/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

01:33:00

Принцип DIP
Dependency Inversion Principle (Принцип инверсии зависимостей)
 */
package OOP.Seminar.Sem06.Task05;

public class LightBulb implements Switchable {
    public void turnOn() {
        // Включение лампочки
    }
    
    public void turnOff() {
        // Выключение лампочки
    }
}

interface Switchable {
    public void turnOn(); // включить
    public void turnOff(); // выключить
}
    
class Switch {
    private Switchable bulb; // "bulb" - лампочка
    
    public Switch(Switchable device) {
        this.bulb = device;
    }
    
    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
    }
}
