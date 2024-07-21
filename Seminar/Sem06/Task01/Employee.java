/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

00:41:00
Генадий Ионов

 */
package OOP.Seminar.Sem06.Task01;

/*
 * Класс "Employe" (Сотрудник)
 * (получение набора данных о сотрудниках)
 */
public class Employee {
    private String name;
    // private double salary; // строка "salary" удалена VSCode при создании
                              // конструктора "Employee" (см. ниже)
                              // восстановление строки выдаёт ошибку

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        // return "Employee [name = " + name + ", salary = " + salary + "]"; // "return" (вариант-1)
        return String.format("Имя: %s, ЗП: %d", name, salary); // "return" (вариант-2)
    }    

}
