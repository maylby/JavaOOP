/*
Объектно-ориентированное программирование (лекции)
Урок 7. Есть ли жизнь без Java?
https://gb.ru/lessons/414495

 */
package OOP.Lesson.Les07.Mathematics.Shapes;

/*
 * Класс прямоугольник (Rectangle),
 * наследующий класс "Shape"
 */
public class Rectangle extends Shape {

    private double width; // поле ширины прямоугольника
    private double height; // поле высоты прямоугольника

    /*
     * Метод "create", создающий прямоугольник (Rectangle)
     */
    public static Rectangle create(double width, double height, String name) {
        
        // ???... Что может пойти не так?
        var instance = new Rectangle();
        instance.name = name;

        instance.width = width;
        instance.height = height;
        return instance;
    }

    /*
     * Конструктор
     */
    private Rectangle() {
    }

    /*
     * Вычисление площади
     */
    @Override
    public double getArea() {
        return this.width * this.height;
    }
    
    /*
     * Печать прямоугольника
     */
    @Override
    public String toString() {
        // ???...
        return String.format("Name: %s  width: %d  height: %d", name, width, height);
    }
}

