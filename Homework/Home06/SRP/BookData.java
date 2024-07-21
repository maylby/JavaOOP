/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework

Реализация SRP 
(Принцип единственной ответственности)
 */
package OOP.Homework.Home06.SRP;

public class BookData<T> extends Book<T> { 
    public BookData(T name, String autor) {
        super(name, autor);    
    }

    int id;
    public void bookData(int id, BookData<T> bookData) {

        /*
         *  сохранение данных о книге 
         */
        bookData.getName(); // получить название книги
        bookData.getAutor(); // получить автора
        // bookData.getNumber(); // получить номер карточки
        id++;
    }
}

class BooksData<T> {
    T data;

    public void booksData(T data) {
        // сохранение данных о книге в базу данных
    }
}

