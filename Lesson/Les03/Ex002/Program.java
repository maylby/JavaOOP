/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */

package OOP.Lesson.Les03.Ex002;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import OOP.Lesson.Les03.Ex002.ExBeverage.*; // импорт папки с файлами для запуска программы


public class Program {
    public static void main(String[] args) {

        //#region Intro Iterator - начало кода
        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(12);
        // nums.add(123);
        // nums.add(1234);
        // nums.add(12345);

        // Iterator<Integer> iter = nums.iterator();
        // while (iter.hasNext()) {
        //     System.out.println(iter.next());
        // }
        //#endregion - конец кода

        // #region Worker Iterator - начало кода
        /*
         * Метод Worker с имплементированным итератором
         */
        Worker worker = new Worker(
            "Имя", "Фамилия", 23, 4567);

        Iterator<String> components = worker; // прямое преведение переменной "worker" 
                                              // к типу (String) итератора (Iterator),
                                              // имплементированный классу "Worker"
        while (components.hasNext()) {
            System.out.println(worker.next());
        }
        //#endregion - конец кода
       
        //#region Beverage Iterator

        // Beverage latte = new Coffee();
        // latte.addComponent(new Water("Вода"));
        // latte.addComponent(new Вeans("Зёрна"));
        // latte.addComponent(new Milk("Молоко"));
        
        // Iterator<Ingredient> iterator = latte;
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        //#endregion
    }
}

