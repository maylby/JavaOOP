/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

https://gb.ru/lessons/414497/homework

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


Реализация (класс "Market")

 * "QueueBehaviour" - алгоритм очереди
 * ("queue" - поле очереди)
 * "MarketBehaviour" - магазин, алгоритм поведения
 * ("market" - поле магазина)
 * прописать поля в ArrayList 
 * "Market" взаимодействует с полями
 */

 package OOP.Homework.Home02.Solution;

 import java.util.ArrayDeque;
 import java.util.ArrayList;
 import java.util.List;
 
 public class Market implements MarketBehaviour, QueueBehaviour{
     ArrayDeque<Actor> queue;
     ArrayList<Actor> market;
 
     @Override
     public void acceptToMarket(Actor actor) {
         market.add(actor);
     }
 
     @Override
     public void releaseFromMarket(List<Actor> actors) {
         market.removeAll(actors);
     }
 
     @Override
     public void update() {
         takeOrders();
         giveOrders();
     }
 
     @Override
     public void takeInQueue(Actor actor) {
         queue.add(actor);
     }
 
     @Override
     public void takeOrders() {
         Human human = (Human) queue.peek();
         if (human != null) {
             human.setTakeOrder();
         }
     }
 
     @Override
     public void giveOrders() {
         Human human = (Human) queue.peek();
         if (human != null) {
             human.setMakeOrder();
         }
     }
 
     @Override
     public void releaseFromQueue() {
         queue.poll();
     }
 }
 