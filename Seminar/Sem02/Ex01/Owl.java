/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 
https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex01;

/*
 * Класс "Owl" 
 * наследует абстрактный класс "Animal",
 * в котором размещён не реализованный метод "voice",
 * и мплеминтирует интерфейс "Feeding", где
 * размещён не реализованный метод "feed",
 * методы следует реализовать, т.к. они не реализуется по умолчанию.
 */
public class Owl extends Animal implements Feeding {

    /*
     * Переопределяем (@Override) метод "voice"
     * задаём значение, указывая конкретный голос
     */
    @Override
	public void voice() {
		System.out.println("uhuu");
	}

    /*
     * Реализуем - имплементируем (implements) метод "feed"
     * задаём значение, указывая, что именно ест животное (Owl)
     */
    @Override
    public void feed() {
        System.out.println("catches mouse");
    } 
}

/*
00:39:00

Роман Сухачев 
Ссылка на репозиторий с кодом занятия на GitHub:
https://github.com/besSmertniyKoder/bstractions

 */