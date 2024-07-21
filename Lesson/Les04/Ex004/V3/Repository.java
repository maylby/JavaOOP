package OOP.Lesson.Les04.Ex004.V3;

import java.util.ArrayList;
import java.util.List;

/*
 * В репозиторий добавлено обобщение, 
 * изменён тип с <T> на <T extends Content>
 */
public class Repository<T extends Content> {
    List<T> ds;

    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n  >>  %s created\n",this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    // В качестве тренировки реализуйте возможность работы с foreach

}
