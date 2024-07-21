/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация ISP (Принцип разделения интерфейса)

Добавлен интерфейс "Article" (статья)
для поиска по текста статьи 
(подстановка в периодические издания)
Добавлен класс "Journal" (журнал)
Добавлен класс "Newspaper" (газета)
*/
package OOP.Homework.Home06.ISP;

/**
 * ArticleJournal
 */
interface ArticleJournal {
    void tableContents();
}

/**
 * ArticleJournal
 */
interface ArticleNewspaper {
    void contents();
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
 * класс "Journal" (журнал)
 * наследует класс Book
 * реализует два интерфейса 
 * для журнала (ArticleJournal)
 * и для газеты (ArticleNewspaper)
 */
class Journal<T> extends Book<T> implements ArticleJournal, ArticleNewspaper {

    public Journal(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

    @Override
    public void tableContents() {
        // метод поиска статьи в газете
        // отличается от поиска в журнале
        // нет оглавления (содержания)
    }

    @Override
    public void contents() {
        // метод поиска статьи в журнале
        // отличается от поиска в газете
        // есть оглавление (содержания)
    }

}


/*
 * класс "Newspaper" (газета)
 * наследует класс Book
 * реализует, только один интерфейс 
 * для газеты (ArticleNewspaper),
 * метод поиска статьи для журнала в газете не применим, т.к.
 * нет оглавления, которое есть в журнале.
 */
class Newspaper<T> extends Book<T> implements ArticleNewspaper {

    public Newspaper(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

    @Override
    public void contents() {
        // метод поиска статьи в газете
        // отличается от поиска в журнале
        // нет оглавления (содержания)
    }
}