/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework

Реализация SRP 
Принцип единственной ответственности
*/
package OOP.Homework.Home06.SRP;

/*
* в классе Book
* Book - книгa в библиотеке
* параметр типа T - ее название
*/
public class Book<T> {
    private T name;
    
    public Book(T name, String autor) {
        this.name = name;
        this.autor = autor;
    }
    
    private String autor; // поле "autor", вынесенное при создании конструктора

    public T getName() {
        return name;
    }
    
    public String getAutor() {
        return autor; // Оставил метод получения "autor" внутри класса "Book".
			          // Не нарушает ли это принципа SRP?
                      // Как вариант вынес данный метод в отдельный класс,
                      // который можно наполнять данными об авторе (годы жизни, жанр и пр.),
                      // например, имплементируя ему соответствующие интерфейсы
    }
    
    @Override
    public String toString() {
        return String.format("Книга %s", name);
    }
}


/*
* класс "Autor"
* содержит метод поиска автора, который
* вынес в отдельный класс
*/
class Autor {
    String autor;

    public void autor() {
        // поиск автора книги
    }
}
