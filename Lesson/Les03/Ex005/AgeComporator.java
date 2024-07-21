/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */
package OOP.Lesson.Les03.Ex005;

import java.util.Comparator;

/*
 * метод сортировки по возрасту
 */
public class AgeComporator implements Comparator<Worker>{

    /*
     * Переопределение метода "compareTo" из "Worker"
     * для сравнения возраста
     */
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

/*
 * метод сортировки по зарплате
 */
class SalaryComporator implements Comparator<Worker>{

    /*
     * Переопределение метода "compareTo" из "Worker"
     * для сравнения зарплаты
     */
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.salary, o2.salary);
    }
}