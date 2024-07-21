/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502/homework

Аттестационная работа

 */
package OOP.Homework.Home07.calculator;

public class CalculationMaker implements ICalculationMaker {
    public Calculable create(int firstArg) {
        return new Calculator(firstArg);
    }
}

