/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

 package OOP.Homework.Home03;

 import java.util.ArrayList;
 // import java.util.Collections;
 import java.util.List;
 
 /**
  * - Создать класс Студент
  * - Создать класс УчебнаяГруппа
  * - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
  * - Реализовать его контракты
  *
  *
  *
  *
  * - Модифицировать класс Студент, заставив его реализовать интерфейс Comparable
  * - Реализовать контракт compareTo () 
  *   со сравнением по какому-либо параметру (пример studentId)
  *
  *
  *
  * - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
  * - Реализовать контракт compare () 
  *   со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
  */
 public class Main {
     public static void main(String[] args) {

        /*
         * Ввод в поле "id" литералов "008" и "009" 
         * система определяет, как ошибку
         */
         Student s01 = new Student(011, "Q", 20, "Chemistry", 5);
         Student s02 = new Student(003, "Q", 26, "Chemistry", 4);
         Student s03 = new Student(002, "A", 22, "Chemistry", 5);
         Student s04 = new Student(004, "A", 22, "Chemistry", 4);
         Student s05 = new Student(005, "Z", 24, "Chemistry", 3);
         Student s06 = new Student(006, "E", 21, "Chemistry", 4);

         Student s07 = new Student(001, "C", 20, "Physics", 5);
         Student s08 = new Student(010, "C", 22, "Physics", 4);
         Student s09 = new Student(012, "A", 22, "Physics", 5);
         Student s10 = new Student(013, "C", 22, "Physics", 5);
         Student s11 = new Student(007, "Z", 24, "Physics", 3);

         Student s12 = new Student(016, "B", 26, "History", 5);
         Student s13 = new Student(017, "B", 22, "History", 5);
         Student s14 = new Student(014, "A", 22, "History", 5);
         Student s15 = new Student(015, "F", 24, "History", 3);

         ArrayList<Student> students = new ArrayList<>(List.of(s01, s02, s03, s04, s05, s06, 
                                                                s07, s08, s09, s10, s11,
                                                                s12, s13, s14, s15));
 
         Group group = new Group(students);
 
         students.sort(new StudentComparator());
 
         for (Student student : group) {
             System.out.println(student);
         }

        //  Group g01 = new Group("Chemistry", 3);
        //  Group g02 = new Group("Physics", 2);
        //  Group g03 = new Group("History", 4);

        //  ArrayList<Group> groups = new ArrayList<>(List.of(g01, g02, g03));

        //  Stream stream = new Stream(groups);
        //  groups.sort(new StreamComparator());

        //  for (Group group : stream) {
        //     System.out.println(group);
        //  }
     }
 }
