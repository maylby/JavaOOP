/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497/homework

*/

package OOP.Homework.Home02.Solution;

public class Human extends Actor {

    @Override
	public String getName() {
		return name;
	}

	@Override
	public void setMakeOrder() {
		isMakeOrder = true;
	}

	@Override
	public void setTakeOrder() {
		isTakeOrder = true;
	}

	@Override
	public boolean isMakeOrder() {
		return isMakeOrder;
	}

	@Override
	public boolean isTakeOrder() {
		return isTakeOrder;
	} 
}
