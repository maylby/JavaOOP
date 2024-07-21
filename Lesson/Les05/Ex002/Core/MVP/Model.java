/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

 */
package OOP.Lesson.Les05.Ex002.Core.MVP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import OOP.Lesson.Les05.Ex002.Core.Infrastructure.Phonebook;
import OOP.Lesson.Les05.Ex002.Core.Models.Contact;

/*
* Модель (Model) работы с данными
*/
public class Model {

    Phonebook currentBook; // записная книжка (import ... Phonebook, Contact)
    private int currentIndex; // индекс текущего контакта
    private String path; // путь (path) к файлу

    /*
    * работа с записной книжкой
    * указан путь (path) к книжке
    */
    public Model(String path) {
        currentBook = new Phonebook();
        currentIndex = 0;
        this.path = path;
    }

    // получение контакта
    public Contact currentContact() {
        if (currentIndex >= 0) {
            return currentBook.getContact(currentIndex); // Метод getContact(int)  
                                                         // не определен для типа "Phonebook"
                                                         // Возможно, нужно добавить механику 
                                                         // обновления записи в "update"
                                                         // или дописать условие (if) 
                                                         // для получения (get) контакта 
                                                         // в "List<Contact>" (см. "Phonebook")
        } else {
            // ???... // что здесь нужно и/или можно дописать?
            return null;
        }
    }

    // загрузка данных
    public void load() {
        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String fname = reader.readLine();
            while (fname != null) {
                String lname = reader.readLine();
                String description = reader.readLine();
                this.currentBook.add(new Contact(fname, lname, description));
                fname = reader.readLine();
            }
            reader.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Хранение данных
    public void save() {

        try (FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < currentBook.count(); i++) {
                Contact contact = currentBook.getContact(i); // (см. комментарий выше)

                writer.append(String.format("%s\n", contact.firstName));
                writer.append(String.format("%s\n", contact.lastName));
                writer.append(String.format("%s\n", contact.description));
            }
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // получение всего списка контактов
    public Phonebook currentBook() {
        return this.currentBook;
    }

    // получение текущего индекса
    public int getCurrentIndex() {
        return this.currentIndex;
    }

    // Изменение текущего индекса
    public void setCurrentIndex(int value) {
        this.currentIndex = value;
    }
}

