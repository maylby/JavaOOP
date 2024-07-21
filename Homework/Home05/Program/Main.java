/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500/homework

 */
package OOP.Homework.Home05.Program;

import java.util.List;


import OOP.Homework.Home05.Data.Student;
import OOP.Homework.Home05.Data.Teacher;
import OOP.Homework.Home05.Service.DataService;

public class Main {
	public static void main(String[] args) {
		DataService data = new DataService();

		data.create(new Student("A", 15));
		data.create(new Student("B", 14));
		data.create(new Student("C", 15));
		data.create(new Teacher("Teach1", 32, List.of("history")));
		data.create(new Teacher("Teach2", 43, List.of("chemistry", "biology")));
		data.create(new Teacher("Teach3", 32, List.of("math", "phisics", "astronomy")));
		data.create(new Teacher("Teach3", 32, List.of("informatics", "math")));

		data.read(true);
		System.out.println();
		data.read(false);

		data.id(2);
	}
}
