/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497/homework

 */

package OOP.Homework.Home02.Solution;

/*
 * Интерфейс QueueBehaviour 
 * описывает логику очереди - 
 * вход/выход из очереди,
 * принятие/отдача заказа
 */
interface QueueBehaviour {

	void takeInQueue(Actor actor);
	void takeOrders();
	void giveOrders();
	void releaseFromQueue();
}
