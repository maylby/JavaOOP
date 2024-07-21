/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Core.Models;

import OOP.Lesson.Les05.Ex003.Mathematics.CalculateArea.Calculate;
import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Canvas;
import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}

