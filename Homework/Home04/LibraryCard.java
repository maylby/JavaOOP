/*
Объектно-ориентированное программирование (семинары)
Урок 4. ООП: Обобщения. ч1
https://gb.ru/lessons/414499/homework

 */
package OOP.Homework.Home04;

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
