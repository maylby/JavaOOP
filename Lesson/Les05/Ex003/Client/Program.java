/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex003.Client;

import OOP.Lesson.Les05.Ex003.Mathematics.Exceptions.UnacceptableValueException;
// import OOP.Lesson.Les05.Ex003.Mathematics.CalculateArea.CalculateArea;
// import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Canvas;
// import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Circle;
// import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Rectangle;
// import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

public class Program {
    public static void main(String[] args) throws UnacceptableValueException {

        new App().start();  // кнопка запуска программы - модуль "App" 
                            // Записи ниже не нужны для работы приложения

        // #region

        // Shape shape1 = Circle.create(1, "Circle_1");
        // Shape shape2 = Rectangle.create(2, 3, "Rectangle_2");
        // Shape shape3 = Circle.create(4, "Circle_3");
        // Shape shape4 = Rectangle.create(5, 6, "Rectangle_4");
        // Shape shape5 = Rectangle.create(7, 8, "Rectangle_5");
        // Shape shape6 = Circle.create(9, "Circle_6");

        // Canvas canvas = new Canvas("Canvas");

        /*
         * Второй вид записи 
         * задана иерархия вложений
         */
        // shape2.shapes.add(shape1);
        // shape4.shapes.add(shape2);
        // shape4.shapes.add(shape3);
        // shape6.shapes.add(shape4);
        // shape6.shapes.add(shape5);

        /*
         * Первый вид записи 
         * последовательный вызов
         */
        // canvas.shapes.add(shape1);
        // canvas.shapes.add(shape2);
        // canvas.shapes.add(shape3);
        // canvas.shapes.add(shape4);
        // canvas.shapes.add(shape5);
        // canvas.shapes.add(shape6);
        
        // System.out.println(canvas);

        // #endregion
    }
}

