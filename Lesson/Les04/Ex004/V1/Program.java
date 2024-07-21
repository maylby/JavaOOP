/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

00:26:00

 */
package OOP.Lesson.Les04.Ex004.V1;

public class Program {
    public static void main(String[] args) {
        Repository audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
        
        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }
        
        Repository videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }

        //#region проблема (!!!)
	    /*
        * в аудио может быть добавлен и видео контент, т.к.
        * в репозитории указан в качестве обобщающения "List<Content>", где
        * "Content" - базовый тип, в котором есть аудио и видео
        */
        audioStorage.add(new VideoContent("jfvjdhdf7768.mp4")); 
        videoStorage.add(new AudioContent("Дорожка 005.wav")); 
        //#endregion

    }
}

