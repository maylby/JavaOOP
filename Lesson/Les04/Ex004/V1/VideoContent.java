/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

Видео формат

 */
package OOP.Lesson.Les04.Ex004.V1;

/*
 * Класс "VideoContent", наследующий 
 * абстрактный класс "Content"
 */
public class VideoContent extends Content {
    public VideoContent(String name) {
        super(name);
    }
}
