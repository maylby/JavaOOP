/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:49:30

Ссылка на репозиторий GitHub с кодами:
https://github.com/besSmertniyKoder/untitled


00:41:00

Абстракция

 */
package OOP.Seminar.Sem01;

/*
 * Абстрактный класс (более старая версия "интерфейса")
 * позволяет писать абстрактные методы
 */
public abstract class S002Animal {
    String test;
    /*
     * "static" привязывает метод "sayHello" 
     * не к экземпляру класса, а к самому классу
     */
    public static void sayHello() {
        System.out.println("sayHello");
    }
    public abstract void voice(); // Не указана реализация, т.к.
                                  // метод абстрактный
}
