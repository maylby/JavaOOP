/*
Объектно-ориентированное программирование (лекции)
Урок 6. SOLID
https://gb.ru/lessons/414494

 */
package OOP.Lesson.Les06;

import java.util.ArrayList;
import java.util.List;

// Single responsibility principle	
// Принцип единственной ответственности
// У класса есть предназначение

public class Ex001_3SRP {
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