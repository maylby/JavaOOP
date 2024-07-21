/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация SRP 
Принцип единственной ответственности

Код класса "LibraryCard" ставлен без изменений
(см. реализация SRP в классах Book и BookData)
*/
package OOP.Homework.Home06.SRP;

import java.util.ArrayList;

/*
* "LibraryCard" - библиотечная карточка определенной книги
* "K" - номер карточки, "V" - информация о книге
*/
public class LibraryCard<K, V> {
    private K number;

    public LibraryCard(K number, ArrayList<V> listBook) {
        this.number = number;
        this.listBook = listBook;
    }

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
