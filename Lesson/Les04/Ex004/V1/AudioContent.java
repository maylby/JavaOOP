/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

Аудио формат

 */
package OOP.Lesson.Les04.Ex004.V1;

/*
 * Класс "AudioContent", наследующий 
 * абстрактный класс "Content"
 */
public class AudioContent extends Content {
    public AudioContent(String name) {
        super(name);
    }
}
