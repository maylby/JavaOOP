package OOP.Homework.Home06.DIP;

/*
Реализация DIP 
Принцип инверсии зависимостей

Модули высокого уровня не должны зависеть от модулей нижнего уровня.
И те, и другие должны зависеть от абстракций.
Абстракции не должны зависеть от деталей. 
Детали должны зависеть от абстракций.

 */
public class BookDIP {
    public static void main(String[] args) {
        BookInfo book = new BookInfo(new ConsoleView());
        book.viewAuthor();
    }
}

interface View {
    void print(String text);
}

class ConsoleView implements View {
    public void print(String text) {
        String result = String.format("Вид консоли %s", text);
        System.out.println(result);
    }
}

class WinFormView implements View {
    public void print(String text) {
        String result = String.format("Форма просмотра %s", text);
        System.out.println(result);
    }
}

// реализация принципа инверсии зависимостей
class BookInfo {
    View view;

    public void setView(View view) {
        this.view = view;
    }

    int indexPage; // вынос поля из полей класса в метод "Book"

    public BookInfo(View view) {
        this.view = view;
        indexPage = 1;
    }

    public void viewTitle() {
        view.print("Заголовок книги");
    }

    public void viewAuthor() {
        view.print("Авторы книги");
    }

    public void turnPage(int page) {
        if (page >= 1 && page <= 300)
            this.indexPage = page;
    }

    public void viewCurrentPage() {
        view.print(String.format("Страница: %s", indexPage));
    }
}