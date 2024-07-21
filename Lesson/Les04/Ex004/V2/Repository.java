// Репозиторий

package OOP.Lesson.Les04.Ex004.V2;

import java.util.ArrayList;
import java.util.List;

/*
* В репозиторий внесено обобщение, а именно,
* Коллекция (List) с неопределённым типом <T>
* + изменение конструкции типа в классе "Repository"
* с "T" на "<T extends Content>" (папка "V3" из "Ex004"), т.е.
* неопределённый тип "Т" наследует базовый класс (Content), где
* заданы форматы аудио и видео
*/
public class Repository<T>{
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }
    
    /*
    * В типе добавляемого контента указываем тип "T", чтобы
    * указать связь между типом добавленного контента 
    * и типом коллекции (List)
    */
    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    /*
    * при получении данных, тоже 
    * возвращаем элемент типа "T"
    */
    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки, реализуйте возможность работы с foreach
    // для запуска цикла "for" в програмном файле (см. в самом низу "Program")

}

