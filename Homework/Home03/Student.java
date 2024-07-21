/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования

https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private String specialization;
    private int rating;
 
    public Student(int id, String name, int age, String specialization, int rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.specialization = specialization;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String getSpecialization() {
        return specialization;
    }
 
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getRating() {
        return rating;

    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Student{" + 
                " id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", specialization = '" + specialization + '\'' +
                ", rating = " + rating +
                '}';
    }
 
    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name); // Код работает, только с именем (name),
                                                  // при "id", "age", "specialization", "rating" 
                                                  // выдаёт ошибку (???)
    }
}
 