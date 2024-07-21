/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

00:19:50

 */
package OOP.Lesson.Les04.Ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));
    
	/*
	* вызов для неопределённых обобщений
    *
    * т.к. в коллекции (List) указан тип <Integer>, то
	* можно задать тот же тип для переменной t, которой
	* класс "Methods" прередаёт метод (getElementFromIntegerCollection), где
	* указаны пременная (data) из коллекции (List) и значение (1)
	*/
	// Integer t = Methods<Integer>.getElementFromIntegerCollection(data, 1);
	// System.out.println(t); // вывод результата
	
	/*
	* вызов для определённых обобщений 
	* (см. связанные геттеры (get) ниже - файл "Methods", папка "Ex003")
	*/
        var el = Methods.getElementFromIntegerCollection(data, 1);
        System.out.println(el);
        el = Methods.<Integer>getElementFromUCollection(data, 2);
        el = Methods.getElementFromUCollection(data, 2);
        System.out.println(el);

    }
}