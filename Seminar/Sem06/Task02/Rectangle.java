/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

 */
package OOP.Seminar.Sem06.Task02;

/*
 * В этом примере, чтобы добавить поддержку других фигур, 
 * придется изменять класс AreaCalculator. 
 * Это нарушает принцип OCP (Open Closed Principle - Принцип открытости/закрытости), 
 * так как класс AreaCalculator закрыт для расширения и изменения.
 * 
 * Реализация принципа OCP
 */
public class Rectangle implements AreaCalculator {
	public double width;
	public double height;

	@Override
	public double calculateArea() {
		return width * height;
	}
}

interface AreaCalculator {
    public double calculateArea();
} 