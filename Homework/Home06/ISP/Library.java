/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация ISP 
Принцип разделения интерфейса

Код класса "Library" ставлен без изменений
(см. реализация ISP в классе Book)

*/
package OOP.Homework.Home06.ISP;

import java.util.ArrayList;
import java.util.List;

public class Library<T, K, V> {

    private List<Book<T>> books;
    private int cardCount;
    private List<LibraryCard<K, V>> libraryCards; 
    
    public Library() {
        books = new ArrayList<>();
        libraryCards = new ArrayList<>();
        cardCount = 0;
    }

    void addBook(Book<T> book) {
        books.add(book);
    }

    void createLibraryCard(LibraryCard<K, V> libraryCard) {
        libraryCards.add(libraryCard);
        cardCount++;
    }

    @Override
    public String toString() {
        return "list = " + "№" + cardCount + libraryCards;
    }

}