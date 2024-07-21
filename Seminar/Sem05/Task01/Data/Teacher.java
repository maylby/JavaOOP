/*
Объектно-ориентированное программирование (семинары)
Урок 5. От простого к практике
https://gb.ru/lessons/414500

 */
package OOP.Seminar.Sem05.Task01.Data;

import java.util.ArrayList;
import java.util.List;

/*
* Класс "Teacher" реализует (наследует) 
* абстрактный класс "User", формирует
* список (List) данных о преподавателе
*/
public class Teacher extends User {
	private List<String> disciples;

	public Teacher(String name, int age, List<String> disciples) {
		this.name = name;
		this.age = age;
		this.disciples = disciples;

	}

	public List<String> getDisciples() {
		return disciples;
	}

	public void setDisciples(ArrayList<String> disciples) {
		disciples = new ArrayList<>();
	}

	@Override
	public String toString() {
	return "Student [name = " + this.name + 
				"age = " + this.age + 
				"id = " + this.disciples + "]";
	}}
