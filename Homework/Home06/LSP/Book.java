/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация LSP (Принцип подстановки Барбары Лисков)

Добавлен интерфейс "Article" (статья)
для поиска по текста статьи 
(подстановка в периодические издания)
Добавлен класс "Journal" (журнал)
Добавлен класс "Newspaper" (газета)
*/
package OOP.Homework.Home06.LSP;

/**
 * Article
 */
interface Article {
    void table();
}
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

/*
 * Класс "Journal" 
 * наследует класс "Book",
 * реализует интерфейс "Article"
 * (поиск статьи по оглавлению)
 */
class Journal<T> extends Book<T> implements Article {

    public Journal(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

    @Override
    public void table() {
        // метод поиска статьи
    }
}

/*
 * Класс "Newspaper" 
 * наследует класс "Book", но
 * не реализует интерфейс "Article", т.к.
 * поиск статьи в журнале отличается поиска в газете
 * (в газете нет оглавления).
 */
class Newspaper<T> extends Book<T> {

    public Newspaper(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

}