/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

// import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class GroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int count;
 
    public GroupIterator(List<Student> students) {
        this.students = students;
        this.count = 0;
    }
 
    @Override
    public boolean hasNext() {
        return count < students.size();
    }
 
    @Override
    public Student next() {
        return students.get(count++);
    }
    
    /*
     * метод удаления (remove)
     * Как реализовать удаление?
     * (одно из условий "Задачи")
     */
    // 
    // @Override
    // default void remove() {
    //    throw new UnsupportedOperationException("remove: %s" + students);
    // }    
}
 