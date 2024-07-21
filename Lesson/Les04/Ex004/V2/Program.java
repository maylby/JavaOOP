// программный файл

package OOP.Lesson.Les04.Ex004.V2;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> audioStorage = new Repository<>("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));
        
        for (int index = 0; index < audioStorage.count(); index++) {
            System.out.println(audioStorage.get(index));
        }
        
        Repository<VideoContent> videoStorage = new Repository<>("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp")); 

        for (int index = 0; index < videoStorage.count(); index++) {
            System.out.println(videoStorage.get(index));
        }
        
        //#region проблема решена


        // audioStorage.add(new VideoContent("jfvjdhdf7768.mp4")); 
        // videoStorage.add(new AudioContent("Дорожка 005.wav")); 

        //#endregion

        //#region 
        // (нет)
        
        /*
        * Чтобы программа работала, только с файлами аудио и видео формата,
        * следует изменить запись в репозитории (см. файл "Repository", папка "V3")
        */ 
        Repository<String> stringRepository = new Repository<String>("stringRepository");
        stringRepository.add("Кринж");
        stringRepository.add("Краш");
        stringRepository.add("Рофл");
        stringRepository.add("Криповый");
        stringRepository.add("Личинус");
        stringRepository.add("Шеймить");
        for (int i = 0; i < stringRepository.count(); i++) {
            System.out.println(stringRepository.get(i));
        }
        //#endregion
	
	/*
	* для работы фора, в качестве тренировки требуется 
	* прописать некий код в файле репозитория (см. задание выше)
	*/
	// for (Content string : videoStorage) {
		
	// }
    }
}

