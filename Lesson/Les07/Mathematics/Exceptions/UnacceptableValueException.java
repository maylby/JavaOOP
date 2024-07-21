/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.Exceptions;

/*
 * Выстраивание иерахии наследования 
 * неких неваллидных данных от "MathematicsException", которое
 * само по себе является исключением
 */
public class UnacceptableValueException extends MathematicsException {
    public UnacceptableValueException(String msg) {
        super(msg);
    }
}
