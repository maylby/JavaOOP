/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 
https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex01;

/**
 * Интерфейс "Feeding" (кормление) 
 * создан для реализации различных методов, т.к.
 * их реализация неоднотипна, в каждом методе своя
 * ("interface" - обновлённая версия "abstract class")
 */
public interface Feeding {
    void feed();
}

/*
00:39:00

Роман Сухачев 
Ссылка на репозиторий с кодом занятия на GitHub:
https://github.com/besSmertniyKoder/bstractions

 */