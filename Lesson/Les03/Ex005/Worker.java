/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */
package OOP.Lesson.Les03.Ex005;

/*
 * Класс "Worker" реализует интерфейс "Comparable",
 * содержащий в себе единственный метод "compareTo", который
 * содержит информацию о том, что значит 
 * один "Worker" (рабочий) больше другого
 */
public class Worker implements Comparable<Worker> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
            String lastName,
            int age,
            int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {

        // return Integer.compare(this.salary, o.salary); // сортировка по зарплате
        // return Integer.compare(this.age, o.age); // сортировка по возрасту
                                                    // упрощённый способ сравнения
                                                    // аналог кода, записанного ниже
        /*
         * Принцип работы метода "compareTo" (?)
         */
        if (this.age > o.age)   // Если текущий возраст (age) 
                                // рабочего (Worker) больше переданного, то
                                // возврат (return): 1
            return 1;
        else if (this.age < o.age)  // Если текущий возраст (age) 
                                    // рабочего (Worker) больше переданного,
                                    // возврат (return): -1
            return -1;
        else
            return 0; // иначе, если age == o.age,
                      // возврат (return): 0
    }
}

