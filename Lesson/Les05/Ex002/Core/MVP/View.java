/*
 * Объектно-ориентированное программирование (лекции)
 * Урок 5. ООП: От простого к практике
 * https://gb.ru/lessons/414493
 * 
 */
package OOP.Lesson.Les05.Ex002.Core.MVP;

/*
 * "View" - Демонстрационный модуль
 */ 
public interface View {
    String getFirstName();
    void setFirstName(String value);
    String getLastName(); // механизм получения фамилии
    void setLastName(String value); // механизм указания фамилии
    String getDescription(); // механизм получения описания
    void setDescription(String value); // // механизм указания (?) описания
    //
}
