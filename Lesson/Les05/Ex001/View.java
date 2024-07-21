package OOP.Lesson.Les05.Ex001;

import java.util.Scanner;

/*
* Модуль демонстарции
*/
public class View {
    Scanner in = new Scanner(System.in); // логика считывания данных (конструктор?)

    // метод получения (get) значения (числа) из текста
    // печать результата
    public int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }
    // Метод вывода в печать окончательного результата
    // print(f'{title} = {data}')
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data); // "\n" - для красоты вывода на экран
    }
}
