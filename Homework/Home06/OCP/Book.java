/*
Объектно-ориентированное программирование (семинары)
Урок 6. ООП Дизайн и Solid
https://gb.ru/lessons/414501/homework


Реализация OCP (Принцип открытости/закрытости)

Добавлен интерфейс "Fragment" 
поиска по текста фрагменту (quoten) 
в периодических изданиях.
Добавлен класс "Journal" (журналы)
*/
package OOP.Homework.Home06.OCP;

/**
 * инерфейс "Fragment"
 * поиск по цитате (quoten),
 * по совпадению набора слов
 */
interface Fragment {
    void quoten(); 
    
}

/*
* абстрактный класс Book - книгa в библиотеке
* параметр типа <T> - ее название
*/
public class Book<T> { // (?) Система сообщает: "Параметр типа T скрывает тип T"
                         // Что это значит? Какие действия от меня требуются?
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

/**
 * класс "Journal" (журналы)
 * наследует класс "Book" и реализует итерфейс "Fragment"
 */
class Journal<T> extends Book<T> implements Fragment {

    // конструктор журнала
    public Journal(T name, String autor, Integer pages) {
        super(name, autor, pages);
        
    }

    @Override
    public void quoten() {
        // метод поиска по фрагменту текста
    }


}