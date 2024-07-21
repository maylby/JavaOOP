/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

Репозиторий, относящийся к контенту (Content)

 */
package OOP.Lesson.Les04.Ex004.V1;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    List<Content> ds;

    private String name;

    /*
    * Конструктор
    */
    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name); // консоль подтверждения факта
							                                        // использования репозитория,
							                                        // но этого здесь быть не должно 
    }
    
    /*
    * Метод лобавления контента
    */ 
    public void add(Content content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public Content get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
