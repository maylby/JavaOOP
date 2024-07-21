/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497/homework

*/

package OOP.Homework.Home02.Solution;

import java.util.List;

/*
 * Интерфейс MarketBehaviour
 * описывает логику магазина – 
 * приход/уход покупателей,
 * обновление состояния магазина
 */
interface MarketBehaviour {

	void acceptToMarket(Actor actor);
	void releaseFromMarket(List<Actor> actors);
	void update(); // "update" вызывает методы "accept" и "release"

}
