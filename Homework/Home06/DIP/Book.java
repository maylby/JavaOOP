/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация DIP 
Принцип инверсии зависимостей

Код класса "Book" ставлен без изменений
(см. реализация DIP в классе BookDIP)
*/
package OOP.Homework.Home06.DIP;

/*
* Book - книгa в библиотеке
* параметр типа T - ее название
*/
public class Book<T> {
    private T name;
    private String autor;
    private Integer pages;
    
    public Book(T name, String autor, Integer pages) {
        this.name = name;
        this.autor = autor;
    }
    
    public T getName() {
        return name;
    }
    
    public String getAutor() {
        return autor;
    }

    public Integer getPages() {
        return pages;
    }
    
    @Override
    public String toString() {
        return String.format("Книга %s", name, pages);
    }
}
