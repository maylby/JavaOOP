/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

00:41:30

Классы работы с терминалом

UI (папка)

 */
package OOP.Lesson.Les05.Ex002.UI;

import java.util.Scanner;
import OOP.Lesson.Les05.Ex002.Core.MVP.View;

/*
* "ConsoleView", реализующий интерфейс "View"
* с описанием конкретных методов
*/
public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public String getFirstName() {
        System.out.printf("FirstName: ");
        return in.nextLine();
    }

    @Override
    public void setFirstName(String value) {
        System.out.printf("FirstName: %s\n", value);
    }

    @Override
    public String getLastName() {
        System.out.printf("LastName: ");
        return in.nextLine();
    }

    @Override
    public void setLastName(String value) {
        System.out.printf("LastName: %s\n", value);
    }

    @Override
    public String getDescription() {
        System.out.printf("Description: ");
        return in.nextLine();
    }

    @Override
    public void setDescription(String value) {
        System.out.printf("Description: %s\n", value);        
    }
    
}

