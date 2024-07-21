/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */
package OOP.Lesson.Les03.Ex001;

/*
 * стандартный класс
 */
public class Worker {

    /*
     * Некий набор различных типов полей
     */
    public String firstName; // имя
    public String lastName;  // фамилия
    public int age;          // возраст
    public int salary;       // зарплата

    /*
     * метод "Worker"
     * задаёт внутреннюю механику работы с полями
     */
    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    /*
     * Конструктор метода,
     * формирующий выдачу из набора тех или иных полей
     */
    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
