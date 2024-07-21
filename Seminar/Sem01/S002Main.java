/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496

00:49:30

Ссылка на репозиторий GitHub с кодами:
https://github.com/besSmertniyKoder/untitled


00:14:30

Инкапсуляция

 */

package OOP.Seminar.Sem01;

public class S002Main {
    static S002Cat cat = new S002Cat();
    public static void main(String[] args) {
        cat.setName("boris");
        cat.setAge(5);
        System.out.println(cat);
        badMethod();
        S002RusGreyCat rusGreyCat = new S002RusGreyCat();
        rusGreyCat.voice();
        S002Animal.sayHello();  // вызов метода "sayHello" 
                                // абстрактного класса "S002Animal"
    }

    public static void badMethod(){
        cat.setName("murka"); // исправление "boris" на "murzik"
                                    // выдаёт:
                                    // Cat{name='boris', age=5}
                                    // bad name! (запрет на исправление имени)
                                    // Cat{name='boris', age=5} (имя прежнее)

        System.out.println(cat); // исправил "murzik" на "murka" 
                                 // выдача:
                                 // Cat{name='boris', age=5} (старое имя)
                                 // Cat{name='murka', age=5} (новое имя)
                                 // Можно изменить имя 
                                 // на любое, кроме "murzik"
    }
}
