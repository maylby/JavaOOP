/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

00:59:30
Роман Сухачев 

 */
package OOP.Seminar.Sem06.Task;

/*
 * В этом примере, чтобы добавить поддержку других фигур, 
 * придется изменять класс AreaCalculator. 
 * Это нарушает принцип OCP (Open Closed Principle - Принцип открытости/закрытости), 
 * так как класс AreaCalculator закрыт для расширения и изменения.
 */

public class Rectangle {
    public double width;
	public double height;
}

/*
 * Если понадобиться вычислить, например, площадь круга, то
 * придётся преписывать код. Что нарушает принципы SOLID.
 */
class AreaCalculator {
	public double calculateArea(Rectangle rectangle) {
	    return rectangle.width * rectangle.height;
	}
}
