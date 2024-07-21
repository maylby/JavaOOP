/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:49:30

Ссылка на репозиторий GitHub с кодами:
https://github.com/besSmertniyKoder/untitled


00:31:00

Наследование (Класс "RusGreyCat")

 */
package OOP.Seminar.Sem01;

/*
 * "S002RusGreyCat" - класс наследник
 * "S002Cat" - класс родитель (наследуемый)
 * Класс наследник может наследовать, только один класс,
 * но родительский класс может иметь 
 * неограниченное число наследников (полиморфизм)
 */
public class S002RusGreyCat extends S002Animal {
    /*
     * Переопределение метода "voice",
     * указанного в абстрактном классе "S002Animal",
     * где метод "voice" не получил реализации, которую
     * можно задать сейчас в ".println()"
     */
    @Override
    public void voice() {
        System.out.println("meow");

    }
}
