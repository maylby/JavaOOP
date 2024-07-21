/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.Exceptions;

/*
 * Класс для работы с математической библиотечкой, который
 * наследует "Exception", папку, в которой размещён
 */
public class MathematicsException extends Exception {
    public MathematicsException(String msg) {
        super(msg);
    }
}