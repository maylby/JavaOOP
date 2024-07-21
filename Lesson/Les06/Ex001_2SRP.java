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

public class Ex001_2SRP {
    public static void main(String[] args) {

        PlannerSRP planner = new PlannerSRP();
        planner.addEntry("1");
        planner.removeEntry(0);
        // planner.saveAllText("path");
        // planner.loadFromDB("10.0.0.0","admin","1234");
        DataManager dm = new DataManager();
        dm.saveAllText(planner, "c:\\безысходность\\srp.txt");

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

// Классу "DataManager" передано управление данными
class DataManager {

    // метод проверки имени файла
    private boolean check(String filenameOfConnect){
        return true;
    }

    // сохранение в файл
    public void saveAllText(PlannerSRP planner,String path) {
        /// ошибки связанные с...
        if(check(path));///
    }
    
    // загрузка из файла
    public void loadFromFile(PlannerSRP planner,String path) {
        /// ошибки связанные с...
        if(check(path));///
    }

    // загрузка из базы данных
    public void loadFromDB(String url, String username, String password) {
        /// ошибки связанные с...
        if(check(url));///
    }    
}
