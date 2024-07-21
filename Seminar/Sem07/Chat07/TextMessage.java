/*
Объектно-ориентированное программирование (семинары)
Урок 7. ООП Дизайн и Solid ч.2
https://gb.ru/lessons/414502

 */
package OOP.Seminar.Sem07.Chat07;

public class TextMessage implements Message {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void sendMess() {
		System.out.println(message);
	}

}
