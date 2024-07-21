/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

00:40:00
 */
package OOP.Lesson.Les05.Ex002.Core.MVP;

import OOP.Lesson.Les05.Ex002.Core.Models.Contact;

public class Presenter {
    
    private Model model;
    private View view; // поле "view" для работы "Presenter"

    public Presenter(View view, String pathDb) { // аргументы "view" и путь (pathDb), который
						 // пробрасывается в модель
        this.view = view;
        model = new Model(pathDb);
    }

    // Загрузка данных
    // (модель работает с конкретным представлением)
    public void LoadFromFile() { 
        model.load(); // загрузка данных

        if (model.currentBook().count() > 0) { // проверка наличия загруженных данных
            model.setCurrentIndex(0); // при наличии данных, получить их
            var contact = model.currentContact(); // предать "view"

            view.setFirstName(contact.firstName);
            view.setLastName(contact.lastName);
            view.setDescription(contact.description);
        }
    }

    // метод добавления данных
    public void add() {
        model.currentBook().add(
                new Contact(view.getFirstName(), 
                            view.getLastName(), 
                            view.getDescription()));
    }

    // метод удаления
    public void remove() {
        Contact contact = new Contact(
					view.getFirstName(), 
					view.getLastName(), 
					view.getDescription()
					);
        model.currentBook().remove(contact);

        if (model.currentBook().count() < 1) {
            model.setCurrentIndex(-1);

            view.setFirstName("");
            view.setLastName("");
            view.setDescription("");
        } else {
            model.setCurrentIndex(model.getCurrentIndex() - 1);
            if (model.getCurrentIndex() < 0)
                model.setCurrentIndex(0);

            Contact temp = model.currentContact();
            view.setFirstName(temp.firstName);
            view.setLastName(temp.lastName);
            view.setDescription(temp.description);
        }
    }

    // метод хранения данных
    public void saveToFile() {
        model.save();
    }

    // метод преключения между контактами
    public void next() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
                model.setCurrentIndex(model.getCurrentIndex() + 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);                
            }
        }
    }

    // переключение к предыдущей записи
    public void prev() {
        if (model.currentBook().count() > 0) {
            if (model.getCurrentIndex() - 1 > -1) {
                model.setCurrentIndex(model.getCurrentIndex() - 1);
                Contact contact = model.currentContact();
                view.setFirstName(contact.firstName);
                view.setLastName(contact.lastName);
                view.setDescription(contact.description);  
            }
        }
    }
}

