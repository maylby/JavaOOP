/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492


00:24:00

Формат Контент
 */
package OOP.Lesson.Les04.Ex004.V1;

/*
 * абстрактный класс "Content"
 */
public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
