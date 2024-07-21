/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501

Александ Верзун
 */
package OOP.Seminar.Sem06.Task01;

public class SaveData {
    Employee employee; // поменял "worker" на "employee"
    int id;

    public void saveData(int id, Employee employee) {
        // сохранение данных сотрудника в базу данных 
        employee.getName(); // показать имя сотрудника
        employee.getSalary(); // показать зарплату
        id++;
    }
}

class SaveData2<T> {
    T data;

    public void saveData(T data) {
        // сохранение данных сотрудника в базу данных
    }
}