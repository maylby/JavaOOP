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

public class S002Cat {
    String name;
    int age;

    /*
     * 00:29:00
     * 
     * код метода "meow()" записан с экрана, 
     * этого кода не было в репозитории GitHub 
     * https://github.com/besSmertniyKoder/untitled
     * 
     * код показан на занятии для демонстрации того, что
     * переменная, которая определена в методе, 
     * не может быть вызвана вне этого метода. 
     * тоже относится к циклам,
     * если переменная определена в цикле, то
     * вызвать её вне цикла нельзя
     * (пример инкапсуляции)
     * 
     * сохранил метод "meow()" для примера
     */
    // public void meow() { 
    //     String meow = "meow";
    //     System.out.println(meow);
    // }

    public void purr(){
        System.out.println("purring");
    }


    public String getName() {
        return name;
    }

    /*
     * запрет на использование имени "murzik"
     */
    public void setName(String name) {
        if (name.equals("murzik")){
            System.out.println("bad name!"); // выдача строки запрета
        }else {
            this.name = name; // разрешено любое имя, кроме "murzik"
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
     * Переопределение метода "toString()"
     */
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
