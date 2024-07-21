/*
Объектно-ориентированное программирование (семинары)
Урок 4. ООП: Обобщения. ч1
https://gb.ru/lessons/414499/homework

 */
package OOP.Homework.Home04;

/*
Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
Каждая книга должна содержать параметр типа T для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет
библиотечную карточку для определенной книги.
 
Карточка должна содержать параметры типов K (номер карточки) и V (информация о книге).
Создайте класс Library, который будет представлять библиотеку. 
У этого класса должны быть методы добавления книг и выдачи библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
*/
public class Main {
    public static void main(String[] args) {

    	Library<String, Integer, String> library = new Library<>(); 
        
    	library.addBook(new Book<>("book", "LastName", 1991)); 
    	library.addBook(new Book<>("jornal", "Edition", 2011));

    	LibraryCard<Integer, String> card1 = new LibraryCard<Integer, String>(0021); 
   	    LibraryCard<Integer, String> card2 = new LibraryCard<Integer, String>(0012);
    
    	card1.setListBook("book");
    	card2.setListBook("jornal");
    	library.createLibraryCard(card1);
    	library.createLibraryCard(card2);

    	System.out.println(library);
    }
}
