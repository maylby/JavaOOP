/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.Shapes;

/*
 * Класс "холст" (Canvas) для вычисления площади фигур, т.е.
 * некая базовая площадь, на которой можно разместить любую фигуру
 * Нужно ли делать подобный модуль? 
 * Ведь, всякая фигура сама по себе уже является "холстом".
 */
public class Canvas extends Shape {
    public Canvas(String name) {
        setNane(name);
    }

    /// ???... area
}
