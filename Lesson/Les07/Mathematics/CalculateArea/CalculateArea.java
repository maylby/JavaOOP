/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.CalculateArea;

import OOP.Lesson.Les05.Ex003.Mathematics.Shapes.Shape;

public class CalculateArea implements Calculate {

    private static CalculateArea instance;
    // static {
    // instance = new CalculateArea();
    // }

    public static CalculateArea getInstance() {
        if (instance == null)
            instance = new CalculateArea();
        return instance;
    }

    private CalculateArea() {
    }

    /**
     * RefInt - класс внутри класса,
     * приватный, т.к. нужен, только 
     * для работы методов "visit" и "calculate" 
     */
    private class RefInt {
        public double value;

        public RefInt(double ident) {
            value = ident;
        }
    }

    /*
     * Метод (calculate) вычисления площади,
     * аналог метода "Print" из класса "Shape"
     */
    private void calculate(Shape shape, RefInt ref) {
        ref.value += shape.getArea();

        for (Shape item : shape.shapes) {
            calculate(item, ref);
        }

    }

    /*
     * Метод, проходящий по всем фигурам
     * и описывающий (считающий?) их
     * (подсчёт в методе "calculate" /см. выше/)
     */
    public double visit(Shape shape) {
        RefInt area = new RefInt(0);

        calculate(shape, area);

        return area.value;
    }

}
