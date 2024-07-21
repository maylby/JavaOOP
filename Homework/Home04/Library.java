/*
Объектно-ориентированное программирование (семинары)
Урок 4. ООП: Обобщения. ч1
https://gb.ru/lessons/414499/homework

 */
package OOP.Homework.Home04;

import java.util.ArrayList;
import java.util.List;

/*
* "Library" - библиотека
* метод добавления книг 
* метод выдачи библиотечных карточек
* метод вывода информации о всех выданных книгах 
* с их библиотечными карточками.
*/
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