/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */
package OOP.Lesson.Les03.Ex004.ExBeverage;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage 
            implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }

}
