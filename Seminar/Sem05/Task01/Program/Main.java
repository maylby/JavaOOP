/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500

 */
package OOP.Seminar.Sem05.Task01.Program;

import java.util.List;

import OOP.Seminar.Sem05.Task01.Data.Student;
import OOP.Seminar.Sem05.Task01.Data.Teacher;
import OOP.Seminar.Sem05.Task01.Service.DataService;

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

		data.id(2); // добавлено на семинаре-6 (00:38:05)
	}
}
