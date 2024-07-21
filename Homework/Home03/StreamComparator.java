/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */
package OOP.Homework.Home03;

import java.util.Comparator;

public class StreamComparator implements Comparator<Student> {
    @Override
    public int compare(Student g1, Student g2) {
        String s1 = g1.getSpecialization();
        String s2 = g2.getSpecialization();
        return s1.compareTo(s2);
    }
}
