
/*
Объектно-ориентированное программирование (лекции)
Урок 6. SOLID
https://gb.ru/lessons/414494

План урока:

- Single responsibility principle (Принцип единственной ответственности)
- Open-closed principle (Принцип открытости/закрытости)
- Liskov substitution principle (Принцип подстановки Лисков)
- Interface segregation principle (Принцип разделения интерфейса)
- Dependency inversion principle (Принцип инверсии зависимостей)


Разговор о SOLID…

1. Single responsibility principle
   Принцип единственной ответственности
2. Open-closed principle
   Принцип открытости/закрытости
3. Liskov substitution principle
   Принцип подстановки Лисков
4. Interface segregation principle
   Принцип разделения интерфейса
5. Dependency inversion principle
   Принцип инверсии зависимостей


Single responsibility principle

Принцип гласит, что может быть только
одна причина, приводящая к изменению класса.
Другими словами, каждый класс должен иметь
только одну ответственность, которая 
должна быть инкапсулирована в этом классе.
- тестируемость;
- читаемость;
- короткое и понятное описание класса;
- простота сопровождения.


SRP-коды в VSCode:

Ex001_1SRP - время? (см. VSCode)
Ex001_2SRP - время? (см. VSCode)

Ex001_3SRP - время? (код ниже)

*/
package OOP.Lesson.Les06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex000_Info {   
}

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

/*public*/ class Ex001_3SRP {
    public static void main(String[] args) {

        PlannerSRP planner = new PlannerSRP();
        planner.addEntry("1");
        planner.removeEntry(0);
        // planner.saveAllText("path");
        // planner.loadFromDB("10.0.0.0","admin","1234");
        DataManager dm = new DataManager();
        dm.saveAllText(planner, "c:\\безысходность\\srp.txt"); // Метод "saveAllText" не определен
                                                               // для типа "DataManager".
    }
}

// Планировщик с двумя функциями, удаление и добавление данных
class PlannerSRP {
    List<String> entries = new ArrayList<>();

    public void addEntry(String text) {
        entries.add(text);
    }
    public void removeEntry(int index) {
        entries.remove(index);
    }
    @Override
    public String toString() {
        return String.join("\n", entries);
    }    
}


class DataManager {
    void save( PlannerSRP planner, String path) {

    }
}

class FileManager extends DataManager {
    private boolean check(String filename){
        return true;
    }

    public void saveAllText(PlannerSRP planner,String path) {
        /// ошибки связанные с...
        if(check(path));///
    }

    private void save( PlannerSRP planner, String path) { // Невозможно уменьшить видимость метода, 
                                                          // унаследованного от "DataManager".
        this.saveAllText(planner, path);
    };
}

// Менеджер базы данных
class DbManeger extends DataManager {

    private void saveDb(PlannerSRP planner, String url, String username, String password) {
        /// ошибки связанные с ...
        if (check(url)); // Метод "check(String)" не определен для типа "DbManeger".
        save(planner, new ContentProvider(url, username, password).getPath());
    }
}

// Поставщик подключения
class ContentProvider {
    String uri;
    String username;
    String password;
    public ContentProvider(String uri, String username, String password) {
        this.uri = uri;
        this.username = username;
        this.password = password;
    }

    public String getPath() {
        return "...";
    }
}

/*
00:18:20

Open-closed principle

Классы должны быть открыты для расширения
и одновременно закрыты для модификации.
Иными словами, должна быть возможность
добавлять новые свойства и расширять класс
без изменения внутренней реализации существующих свойств.

«закрыт для модификации»
«Открыт для расширений» 


Ex002_1OCP (см. код ниже)

*/

// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять

/* public */ class Ex002_1OCP {
    public static void main(String[] args) {
        System.out.println(new Client(1).getDiscount(100));
    }
}

class Client {
    public int clientType;

    public Client(int type) {
        clientType = type;
    }

    /*
     * Метод предоставления скидок клиентам
     * в зависимости от их статуса
     * Метод ограничен в расширении списка 
     * предоставляемых скидок разным клиентам.
     * В случае необходимости расширения списка, 
     * код придётся переписать полностью.
     */
    public double getDiscount(double price) {
        return (clientType == 1) ? price *0.85 : price *0.95;
    }
}

// Больше клиентов = больше if'ов


/* public */ class Ex002_2OCP {
    public static void main(String[] args) {

        /*
         * Записии о предоставляемых скидках
         * для клиента того или иного статуса.
         * Для изменения скидок или расширения списка,
         * достаточно изменить размер скидки, либо
         * добавить клиента с новым статусом.
         * 
         * /// Добавить самостоятельно новое поле клиента
         */
        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverPartner().getDiscount(100));
        System.out.println(new GoldPartner().getDiscount(100));
        System.out.println(new VIPPartner().getDiscount(100));
    }
}

/*
 * Гибкий способ предоставления скидок клиентам
 * в зависимости от их статуса, где
 * каждый следующий по статусу клиент получает
 * скидки клиета предыдущего статуса и
 * к полученным скидкам получает дополнительную,
 * соответствующую его статусу
 * Метод допускает неограниченное число расширений
 * без переписывания всего кода.
 * 
 * /// реализовать промо-код
 * /// прописать систему бонусов
 */
class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}

class SilverPartner extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}

class GoldPartner extends SilverPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}

class VIPPartner extends GoldPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9;
    }
}


/*
00:23:30

Liskov substitution principle

Требует возможности использования любых
порожденных классов на месте родительских.

При этом они должны обладать
тем же поведением, что и родительские классы,
без внесения изменений.

Этот принцип гарантирует, что порожденный
класс не изменяет определение типа
родительского и его поведение. 


Ex003_1LSP (см. VSCode)
Ex003_2LSP (см. код ниже)

*/

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// Liskov substitution principle
// Принцип подстановки Лисков
// Наследник не должен "ломать" поведение
// Наследник не должен делать меньше чем родитель

/* public */ class Ex003_2LSP {
    public static void main(String[] args) {
        List<AbstractAnimal> list1 = new ArrayList<>(Arrays.asList(new Dog(), new Python()));

        for (var animal : list1) {
            System.out.println(animal.getType());
        }

        /*
         * Интерфейс (?) "Legs" (лапы)
         * содержит в себе список животных, имеющих лапы.
         * Если определённый класс не имплементирует данный интерфейс, то
         * животное, принадлежащее этому классу, нельзя будет внести в список.
         * Т.е., система не позволит вписать, например, змею или рыбу.
         */
        List<Legs> list2 = new ArrayList<>(Arrays.asList(new Dog()/* , new Python() */));
        for (var animal : list2) {
            System.out.println(animal.getLegsCount());

        }
    }
}

abstract class AbstractAnimal {
    public String getType() {
        return "Зверушка";
    }
}

interface Legs {
    int getLegsCount();
}

class Dog extends AbstractAnimal implements Legs {

    @Override
    public String getType() {
        return "собачка";
    }

    @Override
    public int getLegsCount() {
        return 4;
    }
}

class Python extends AbstractAnimal {
    @Override
    public String getType() {
        return "питончик";
    }
}


/*
00:28:00

Interface segregation principle
(принцип разделения интерфейсов)

Клиенты не должны реализовывать интерфейсы,
которые они не используют.

Данный принцип требует разделения «толстых»
интерфейсов на несколько специализированных,
связанных общей функциональностью.

*/

// Interface segregation principle

// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. 
// Детали должны зависеть от абстракций.

/* public */ class Ex004_2ISP {
    public static void main(String[] args) {

    }
}

interface BasePhone {
    void Call();
    void SendSMS();
}

interface Fax {
    void SendFax();

}

interface EMail {
    void SendEMail();
}

class IPhone implements BasePhone, Fax, EMail {

    @Override
    public void Call() {

    }

    @Override
    public void SendSMS() {
    
    }

    @Override
    public void SendEMail() {

    }

    @Override
    public void SendFax() {
        
    }
}

class Nokia3311 implements BasePhone {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {

    }
}


/*
00:33:00

Dependency inversion principle

Принцип инверсии зависимостей

- модули высокого уровня не должны зависеть от модулей нижнего уровня.
  И те, и другие должны зависеть от абстракций.
- абстракции не должны зависеть от деталей.
  Детали должны зависеть от абстракций.


Ex005_1DIP (см. код ниже)
Ex005_2DIP (см. код ниже)

*/
/* public */ class Ex005_1DIP {
    public static void main(String[] args) {
        Book book = new Book();
        book.viewAuthor();

    }
}

interface View {
    void print(String text);
}

class ConsoleView implements View {
    public void print(String text) {
        String result = String.format("ConsoleView %s", text);
        System.out.println(result);
    }
}

class WinFormView implements View {
    public void print(String text) {
        String result = String.format("WinFormView %s", text);
        System.out.println(result);
    }
}

class Book {
    View view;

    int indexPage;

    public Book() {
        this.view = new ConsoleView();
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


// Иная запись функционала

// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
// И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. 
// Детали должны зависеть от абстракций.

/* public */ class Ex005_2DIP {
    public static void main(String[] args) {
        BookDIP bookDIP = new BookDIP(new ConsoleViewDIP());
        bookDIP.viewAuthor();
    }
}

interface ViewDIP {
    void print(String text);
}

class ConsoleViewDIP implements ViewDIP {
    public void print(String text) {
        String result = String.format("ConsoleViewDIP %s", text);
        System.out.println(result);
    }
}

class WinFormViewDIP implements ViewDIP {
    public void print(String text) {
        String result = String.format("WinFormViewDIP %s", text);
        System.out.println(result);
    }
}

class BookDIP {
    ViewDIP view;

    public void setView(ViewDIP view) {
        this.view = view;
    }

    int indexPage;

    public BookDIP(ViewDIP view) {
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
