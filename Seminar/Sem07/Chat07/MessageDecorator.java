/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502

 */
package OOP.Seminar.Sem07.Chat07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageDecorator implements Message {
	Message mess;
	LocalDateTime currentDateTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	String formattedDateTime = currentDateTime.format(formatter);

	public MessageDecorator(Message mess) {
		this.mess = mess;
	}

	@Override
	public void sendMess() {
		mess.sendMess();
		System.out.println(formattedDateTime);
	}

}
