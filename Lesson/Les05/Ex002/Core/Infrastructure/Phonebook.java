/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

Ядро

"Core" (папка ядра)
"Infrastructure" - Инфрасруктурный модуль (вложенная папка)

 */
package OOP.Lesson.Les05.Ex002.Core.Infrastructure;

import java.util.ArrayList;
import java.util.List;

import OOP.Lesson.Les05.Ex002.Core.Models.Contact;

/*
* класс Phonebook (записная книжка)
*/
public class Phonebook {

    private List<Contact> contacts;
    
    public Phonebook() {
        contacts = new ArrayList<Contact>(); // создание книжки, инициализации
    }

    // create (добавление контакта)
    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    // read (чтение - получение)
    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    // update (добавить механику обновления записи, самостоятельно)
    // ???...

    // delete (удаление)
    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        // if ???...
        return contacts;
    }


    public int count() {
        return contacts.size();
    }

}
