/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

00:20:20

*/
package OOP.Lesson.Les04.Ex003;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {

    /*
    * Определённые обобщения
    */
    public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {
        return col.get(index);
    }

    public static String getElementFromStringCollection(List<String> col, int index) {
        return col.get(index);
    }

    public static Double getElementFromDoubleCollection(List<Double> col, int index) {
        return col.get(index);
    }

    // #region

    /*
     * 00:21:10
     * Неопределённые обобщения
     *
     * Статический метод завязанный на каком-то общем типе, наперёд неизвестном
     * Есть некиая коллекция элементов (List<U>), где 
     * <U> указано как обобщение (static <U>)
     * Метод (getElementFromUCollection) будет возвращать элемент типа "U",
     * что он и делает (col.get(index))
     */
    public static <U> U getElementFromUCollection(List<U> col, int index) {
        return col.get(index);
    }


    // #endregion

    //#region
    
    /*
     * Использование несколькиих типов (двух), где
     * возвращаемый элемент - переменная типа "T2"
     */
    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {
        // Map<Integer,String> hm = new HashMap<>();
        // hm.put(key, value)
        return arg2;
    }

    //#endregion
}

