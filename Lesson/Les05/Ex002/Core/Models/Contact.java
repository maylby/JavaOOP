/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex002.Core.Models;

import java.time.LocalDate;

/*
* Определение модели (Contact)
*/
public class Contact  implements Comparable<Contact> {

    // Поля контакта
    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;
    //public String email; // Можно использовать, как строку
    //public Email email;  // Можно описать отдельную сущность,
			   // модель хранения емейл-адреса 
			   // проверка на валлидность
			   // поэтапное введение адреса (?)
			   // введение домена 1, 2, 3 уровней
    public String description;
    
    // конструктор с тремя аргументами
    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
    
    // добавить возможность создания объектов с бОльшим
    // количеством параметров

    @Override
    public int compareTo(Contact o) {
        // ???...
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.firstName == t.firstName
                && this.lastName == t.lastName
        ;
    }
}
