/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

00:41:30

 */
package OOP.Lesson.Les05.Ex002.UI;

/*
* Класс создания новой консоли 
* для внесения изменений в код 
* без изменения пержних записей (ветвление)
*/
public class NewConsoleView extends ConsoleView {
    
    public NewConsoleView() {
        super();
    }

    @Override
    public void setDescription(String value) {
        super.setDescription(value);
        System.out.println();

    }
}