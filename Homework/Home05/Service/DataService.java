/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500/homework

 */
package OOP.Homework.Home05.Service;

import java.util.ArrayList;
import java.util.List;

import OOP.Homework.Home05.View.DataView;
import OOP.Homework.Home05.Data.Student;
import OOP.Homework.Home05.Data.Teacher;
import OOP.Homework.Home05.Data.User;

public class DataService {

	private ArrayList<Teacher> teachers;
	private ArrayList<Student> students;

	public DataService() {
		this.teachers = new ArrayList<>();
		this.students = new ArrayList<>();
	}

	public void create(User user) {
		if (user instanceof Student) {
			int id = students.size();
			Student student = new Student(user.getName(), user.getAge());
			student.setId(id + 1);
			students.add(student);
		} else if (user instanceof Teacher) {
			Teacher teacher = new Teacher(user.getName(), user.getAge(), 
							List.of("Math", "Phisics"));
			teachers.add(teacher);
		}

	}

	public void read(boolean bool) { // true student
		if (bool) {
			System.out.println(students);
		} else if (!bool) {
			System.out.println(teachers);
		}
	}

	public void id(int id) {
		dataView.studCheck(students, id); 

	}
}
