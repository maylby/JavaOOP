/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502/homework

Аттестационная работа

 */
package OOP.Homework.Home07.calculator;

/*
 * Создать проект калькулятора комплексных чисел 
 * (сложение, умножение и деление). 
 * Применить при создании программы архитектурные паттерны, 
 * добавить логирование калькулятора.
 */
public class Main {
    public static void main(String[] args) {
        ICalculationMaker calculationMaker = new CalculationMaker();
        ViewCalculator view = new ViewCalculator(calculationMaker);
        view.run();
    }
}