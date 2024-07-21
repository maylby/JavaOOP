/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502

 */
package OOP.Seminar.Sem07.Chat07;

import lesson7.MessageDecorator;
import lesson7.TextMessage;

/*
Разработать декоратор для добавления дополнительной информации к текстовому сообщению.
Создать интерфейс Message, который определяет методы для отправки и получения текстового сообщения.
Реализовать класс TextMessage, представляющий базовое текстовое сообщение.
Создать декоратор MessageDecorator, который будет добавлять 
дополнительную информацию к текстовому сообщению (например, дату отправки).

Написать клиентский код, который будет использовать декоратор для отправки 
и получения текстовых сообщений с дополнительной информацией.
*/
public class Main {
	public static void main(String[] args) {

		TextMessage tm = new TextMessage(); 

		tm.setMessage("Hello world"); // Метод sendMess() не определен для типа TextMessage.
		MessageDecorator ms = new MessageDecorator(tm);

		tm.sendMess(); // Метод sendMess() не определен для типа TextMessage.
		ms.sendMess(); // Метод sendMess() не определен для типа TextMessage.
	}
}