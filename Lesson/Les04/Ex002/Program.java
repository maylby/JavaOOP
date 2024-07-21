/*
Объектно-ориентированное программирование (лекции)
Урок 4. ООП: Обобщения
https://gb.ru/lessons/414492

00:14:30
Экземпляр "воркера" (рабочего)

 */
package OOP.Lesson.Les04.Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {

        Worker w = new Worker(28, "firstName", "lastName", 20, 22);
        System.out.println(w); // добавил, чтобы система "не ругалась"
                               // (?) не выводит ничего
        // #region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>(
                1990,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId()); // Выводит, только значение "id" (1990)

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>(
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId()); // (?) вывод: 64c707a5-2442-4217-b2ad-3348d31b11be

        // #endregion

        // #region MultiParameterized
        MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
                1, 2.0, "3.0");
        System.out.println(mp1); // E1 type: Integer  E2 type: Double  E3 type: String 

        MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
                "1", "2.0", "3.0");
        System.out.println(mp2); // E1 type: String  E2 type: String  E3 type: String

        // #endregion
    }
}
/*
Вывод:
1990
64c707a5-2442-4217-b2ad-3348d31b11be
E1 type: Integer  E2 type: Double  E3 type: String
E1 type: String  E2 type: String  E3 type: String
 */