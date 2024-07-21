/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

00:16:00
Роман Сухачев 

 */
package OOP.Seminar.Sem06.Task;

/*
Здесь Engineer вынужден реализовывать метод eat(), хотя он ему не нужен. 
Принцип ISP (Interface Segregation Principle - Принцип разделения интерфейса) нарушается, т.к. 
интерфейс Worker должен быть разделен на более мелкие воизбежание "жирных" интерфейсов.

 */
interface Worker {
	void work();
	void eat();
}

class Engineer implements Worker {
	public void work() {
		// Реализация работы инженера
	}

	public void eat() {
		// Реализация приема пищи
	}
}
