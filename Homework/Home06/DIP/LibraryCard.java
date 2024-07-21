/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация DIP 
Принцип инверсии зависимостей

Код класса "LibraryCard" ставлен без изменений
(см. реализация DIP в классе BookDIP)
*/
package OOP.Homework.Home06.DIP;

import java.util.ArrayList;

/*
* "LibraryCard" - библиотечная карточка определенной книги
* "K" - номер карточки, "V" - информация о книге
*/
public class LibraryCard<K, V> {
    private K number;
    private ArrayList<V> listBook = new ArrayList<>();

    public LibraryCard(K number) {
        this.number = number;
    }

    public ArrayList<V> getListBook() {
        return listBook;
    }

    public void setListBook(V book) {
        listBook.add(book);
    }

    @Override
    public String toString() {
        return  "Книга:{ " + number +
                ", Аннотация: " + listBook +
                '}';
    }
}
