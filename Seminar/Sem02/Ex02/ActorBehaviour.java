/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497

*/

package OOP.Seminar.Sem02.Ex02;

interface ActorBehaviour {

	void setMakeOrder();
	void setTakeOrder();

	boolean isMakeOrder();
	boolean isTakeOrder();
}
