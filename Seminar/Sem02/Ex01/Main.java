/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 
https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex01;

/*
 * Классе "Main" 
 * Создание новых переменных (cat, owl) и
 * вызов методов, реализующих переменные
 */
public class Main {
    public static void main(String[] args) {
		Cat cat = new Cat();
		Owl owl = new Owl();
		cat.voice();
		owl.voice();
        cat.feed();
        owl.feed();
    }
}
/* 
вывод:
    meow
    uhuu
    feeding with whiskas
    catches mouse 
*/ 

/*
00:39:00

Роман Сухачев 
Ссылка на репозиторий с кодом занятия на GitHub:
https://github.com/besSmertniyKoder/bstractions

 */