/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

*/
package OOP.Lesson.Les05.Ex001;

public class Presenter {

    View view; 	// представление неопределённого типа переменной, 
		// с которым работает метод (Presenter)
    Model model; // модель с неопределённым типом переменной, 
		 // с которой работает "Presenter"

    // Конструктор, в котором метод получает 
    // уже конкретные модели и представления
    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }
 
    // получение занчений (a, b) 
    // после ввода пользователем какого-то текста 
    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a); // связывание пришедших данных с данными,
        model.setY(b); // которые нужно положжить (set) в модель (model)
        int result = model.result(); // предача переменной (result) полученного результата
        view.print(result, "Sum: "); // вывод в печать (print) методом "view"
    }
}
