/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502/homework

Аттестационная работа

 */
package OOP.Homework.Home07.calculator;

interface Calculable {
    Calculable sum(int arg);
    Calculable mult(int arg);
    Calculable div(int arg);
    int getResult();
}
