/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500

 */
package OOP.Seminar.Sem05.Task01.Data;
/*
* Класс "Student" реализует (наследует) 
* абстрактный (?) класс "User", присваивая
* "id" каждому студенту (Student)
*/
public class Student extends User {
	private int id;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name = " + this.name + 
					"age = " + this.age + 
					"id = " + id + "]";
	}}
