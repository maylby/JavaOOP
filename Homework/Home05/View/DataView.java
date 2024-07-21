/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500

 */
package OOP.Homework.Home05.View;

import java.util.ArrayList;

// import OOP.Homework.Home05.Service.DataService;
import OOP.Homework.Home05.Data.Student;

public class DataView {
    public DataView() {

    }

    public void studCheck(ArrayList<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }
}
