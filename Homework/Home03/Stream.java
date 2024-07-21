/*
Объектно-ориентированное программирование (семинары)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414498/homework

 */

package OOP.Homework.Home03;

import java.util.List;
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterator<Group>{
    private ArrayList<Group> groups;
    private String specialiation;
    private int number;
    

    public Stream(ArrayList<Group> groups) {
        this.groups = groups;
        this.index = 0; // "index" - то же, что "count"
                        // (см. файл "GroupIterator")
    }

    public String fullGroup() {
        return String.format("%s", groups);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < groups.size(); // "size" - число групп,
                                        // возможно, нужно написать "length" (?)
    }
    
    @Override
    public String next() {  // "String" подчёркнут красным 
                            // Система: "Тип возвращаемого значения 
                            // несовместим с Iterator<Group>" (???)
        switch (index) {
            case 1:
                return String.format("gpoup: %s", specialiation);
            default:
                return String.format("number: %s", number);
        }
    }
}
