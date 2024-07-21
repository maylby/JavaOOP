/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500

 */
package OOP.Seminar.Sem05.Task01.View;

import java.util.ArrayList;

import OOP.Homework.Home03.Student;

public class StudentView {
    public StudentView() {

    }

    public void studCheck(ArrayList<Student> students, int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
            }
        }
    }
}

// можно решить с помощью итератора (Роман Сукачёв)
// (?) интерфейса итератор?
// (?) "Iterator<String> iter = ..."