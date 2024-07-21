/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */

package OOP.Lesson.Les03.Ex004;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import OOP.Lesson.Les03.Ex004.ExBeverage.*; // импорт папки с файлами для запуска программы


// три воды
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        latte.addComponent(new Water("вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }
    }
}
