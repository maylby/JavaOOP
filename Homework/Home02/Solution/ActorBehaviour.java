/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497/homework

*/

package OOP.Homework.Home02.Solution;

interface ActorBehaviour {

	void setMakeOrder();
	void setTakeOrder();

	boolean isMakeOrder();
	boolean isTakeOrder();
}
