package OOP.Lesson.Les04.Ex004.V4;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> mGlinka = new Repository<>("mGlinka");
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 1"));
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 2"));
        
        
        for (int index = 0; index < mGlinka.count(); index++) {
            System.out.println(mGlinka.get(index));
        }
        
        Repository<AudioContent> pTchaikovsky = new Repository<>("pTchaikovsky");
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 1"));
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 2"));
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 3"));
        
        
        for (int index = 0; index < pTchaikovsky.count(); index++) {
            System.out.println(pTchaikovsky.get(index));
        }
        System.out.println();
        System.out.println();
        // System.out.println();

        System.out.println(pTchaikovsky.count()); // 3 - число строк, выводимых ниже

        for (int index = 0; index < pTchaikovsky.count(); index++) {
            System.out.println(pTchaikovsky.get(index));
        }
        System.out.println();

        // Repository<VideoContent> videoContent = new Repository<>("videoContent");
        // videoContent.add(new VideoContent("ВИДЕО 1"));
        // videoContent.add(new VideoContent("ВИДЕО 2"));
        
        // /*
        //  * Контроль ошибки слияния (merge) аудио и видео контента
        //  */
        // pTchaikovsky.merge(videoContent); // Метод merge(Repository<AudioContent>) 
        //                                   // типа Repository<AudioContent> 
        //                                   // неприменим для аргументов 
        //                                   // (Repository<VideoContent>)Java(67108979)

        // for (int index = 0; index < pTchaikovsky.count(); index++) {
        //     System.out.println(pTchaikovsky.get(index));
        // }
    }
}
