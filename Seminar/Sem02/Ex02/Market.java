/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497


01:04:00

Задание 2

Необходимо реализовать строение классов, без
конкретной реализации:

1. Интерфейс QueueBehaviour, который описывает
   логику очереди – помещение в/освобождение из
   очереди, принятие/отдача заказа

2. Интерфейс MarketBehaviour, который описывает
   логику магазина – приход/уход покупателей,
   обновление состояния магазина

3. Класс Market, который реализовывает два
   вышеуказанных интерфейса и хранит в списке
   список людей в очереди в различных статусах


Домашнее задание (ДЗ-2)

Реализовать класс Market и все методы, которые он обязан реализовывать. 
Методы из интерфейса QueueBehaviour, имитируют работу очереди, 
MarketBehaviour – помещает и удаляет человека из очереди, 
метод update – обновляет состояние магазина (принимает и отдает заказы)


<<class>>
Market

void: acceptToMarket 
void: acceptToMarket 
void: acceptToMarket


P.S.
Рекомендации по выполнению ДЗ:

 * Реализация - класс "Market"
 * "QueueBehaviour" - это очередь (алгоритм очереди)
 * ("queue" - поле очереди)
 * "MarketBehaviour" - это магазин (алгоритм поведения)
 * ("market" - поле магазина)
 * прописать поля в ArrayList 
 * "Market" - взаимодействие с полями
 */

package OOP.Seminar.Sem02.Ex02;

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque; // класс "ArrayDeque" 
							 // наследует класс AbstractCollection<E>
							 // реализует интерфейсы:
							 // Deque<E>, Cloneable, Serializable

/**
 * Класс "Market" реализует 
 * интерфейсы "MarketBehaviour" и "QueueBehaviour" 
 * и хранит список людей в очереди в различных статусах
 */
public class Market implements QueueBehaviour, MarketBehaviour {
    ArrayDeque<Actor> queue; // очередь
    ArrayList<Actor> market; // магазин
	
	/**
	 * Реализация интерфейса "QueueBehaviour"
	 * (4 метода ниже)
	 * 
	 * "takeInQueue" ставит в очередь
	 */
	@Override
	public void takeInQueue(Actor actor) {
        queue.add(actor); // добавить в очередь
	}

	/*
	 * "takeOrders" принимает заказы
	 */
	@Override
	public void takeOrders() {
        Human human = (Human) queue.peek(); // проверка очереди
		/*
		 * Если число людей не равно нулю, то
		 * внести заказ в список
		 */
        if (human != null) {
            human.setTakeOrder();
        }
	}

	/*
	 * "giveOrders" отдаёт заказы
	 */
	@Override
	public void giveOrders() {
        Human human = (Human) queue.peek(); // проверка очереди
		/*
		 * Если число людей не равно нулю, то
		 * отдать заказ из списка
		 */
        if (human != null) {
            human.setMakeOrder();
        }
	}

	/*
	 * "releaseFromQueue" выпускает из очереди
	 */
	@Override
	public void releaseFromQueue() {
        queue.poll();
	}


	/**
	 * Реализация интерфейса "MarketBehaviour"
	 * (3 метода ниже)
	 * 
	 * "acceptToMarket" - вход в магазин
	 */
	@Override
	public void acceptToMarket(Actor actor) {
		market.add(actor);
	}

	/*
	 * "releaseFromMarket" - выход из магазина
	 */
	@Override
	public void releaseFromMarket(List<Actor> actors) {
		market.removeAll(actors);
	}

	/*
	 * "update" - обновление информации о заказах
	 */
	@Override
	public void update() {
        takeOrders(); // принятые заказы
        giveOrders(); // отданные заказы
	}
}

