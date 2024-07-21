/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

00:42:30

 */
package OOP.Lesson.Les05.Ex002.UI;

import java.util.Scanner;

import OOP.Lesson.Les05.Ex002.Config;
import OOP.Lesson.Les05.Ex002.Core.MVP.Presenter;
import OOP.Lesson.Les05.Ex002.Core.MVP.View;

public class App {
    public static void ButtonClick() {
        System.out.print("\033[H\033[J");// ru.stackoverflow.com/questions/1315049/Как-очистить-						консоль-в-java-во-время-действия-программы
        View view = new NewConsoleView();
        Presenter presenter = new Presenter(view, Config.pathDb);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next");
                String key = in.next();
                System.out.print("\033[H\033[J"); // ссылка на инфу по данной строке (см. исходник)
                switch (key) {
                    case "1":
                        presenter.prev(); // 1 - предыдущая запись
                        break;
                    case "2":
                        presenter.next(); // 2 - следующая запись
                        break;

                    default:
                        System.out.println("Такой команды нет"); // ошибка ввода
                        break;
                }
            }
        }
    }
}


