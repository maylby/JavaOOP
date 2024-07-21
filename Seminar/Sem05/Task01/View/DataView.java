/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500

 */
package OOP.Seminar.Sem05.Task01.View;

import OOP.Seminar.Sem05.Task01.Service.DataService;
import OOP.Seminar.Sem05.Task01.Data.Student;
import OOP.Seminar.Sem05.Task01.Data.User;

/**
 * Сделать package View
 * Написать View, где будет метод вывода в консоль 
 * данных студента, поданных на вход.
 */
public class DataView {
    private DataService DataService;

    public DataView() {
        this.DataService = new DataService();
    }
    public void addUser(User student){
        DataService.addUser(student);

    }

    public void showUser() {
       DataService.seeUser();
    }

    @Override
    public String toString() {
        return "DataView {" +
                "DataService = " + DataService +
                '}';

    }
}
