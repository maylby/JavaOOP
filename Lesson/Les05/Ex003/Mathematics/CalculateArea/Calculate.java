/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Mathematics.CalculateArea;

import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

/*
 * Интерфейс "Calculate", который содержит 
 * один метод (visit), принимающий фигуру
 */
public interface Calculate {
    double visit(Shape shape);
}
