/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501


Здесь Engineer вынужден реализовывать метод eat(), хотя он ему не нужен. 
Принцип ISP (Interface Segregation Principle - Принцип разделения интерфейса) нарушается, т.к. 
интерфейс Worker должен быть разделен на более мелкие воизбежание "жирных" интерфейсов.

Реализация принципа ISP 
(Interface Segregation Principle - Принцип разделения интерфейса)
 */
package OOP.Seminar.Sem06.Task04;

interface Working {
    void work();
}

interface Eating {
    void eat();    
}

class Engineer implements Working {
    
    @Override
    public void work() {
    }
}

class Worker implements Working, Eating {

    @Override
    public void eat() {
    }

    @Override
    public void work() {
    }

}