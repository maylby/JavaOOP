/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.CalculateArea;

import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

/*
 * Интерфейс "Calculate", который содержит 
 * один метод (visit), принимающий фигуру
 */
public interface Calculate {
    double visit(Shape shape);
}
