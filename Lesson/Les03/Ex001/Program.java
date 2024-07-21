/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */

package OOP.Lesson.Les03.Ex001;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        /*
         * 00:06:00
         * 
         * Каменецкий рассказывает про анотацию итератора (F12),
         * показывает методы "hasNext()", "next()"
         * и ни слова не говорит о том, как работать с "remove()",
         * не показывает в каких случаях и как его применяеть.
         * И далее об этом не говорит! Он этого не знает?!
         * А ведь, в домашних заданиях требуют применить этот метод!!!
         * Как в этом разобраться самому, если английским не владеешь?!
         * Перевод Google, напоминает бессмысленную галиматью!
         */
        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next()); // вывод набора чисел (см. выше)
        }

        Worker worker = new Worker( // "worker" нельзя вывести пока не реализован итератор (ниже)
            "Имя", "Фамилия", 23, 4567);

        // Iterator<Object> components = worker.iterator(); // метод не реализован (подчёркнут красным)
                                                         // чтобы итератор начал ходить
                                                         // по отдельным членам (worker),
                                                         // ему имплементируют интерфейс
                                                         // (см. папку "Ex002")
    }
}
