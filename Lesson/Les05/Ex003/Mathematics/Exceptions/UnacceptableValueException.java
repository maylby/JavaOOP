/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Mathematics.Exceptions;

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
