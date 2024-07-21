/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student t1, Student t2) {

        /*
         * Модифицировал Comparator так, чтобы 
         * можно было сравнить оценки студентов,
         * поменял "getAge" на "getRating",
         * добавил поле "rating" в файл "Student"
         */
        String s1 = t1.getName() + t1.getRating();
        String s2 = t2.getName() + t2.getRating(); 
        return s1.compareTo(s2);
    }
}
