/*
Объектно-ориентированное программирование (семинары)
Урок 2. Принципы ООП Абстракция и интерфейсы. 

Пример проектирования
https://gb.ru/lessons/414497


Как эффективно заниматься в асинхронном формате?

� Не забывайте смотреть лекцию перед тем, как перейти к семинару;
� Во время выполнения заданий ставьте видео на паузу и пробуйте выполнить его самостоятельно;
� После самостоятельного выполнения задания, обязательно посмотрите как преподаватель выполняет
его и анализируйте свои действия;
� Обязательно выполняйте домашнее задание после семинара;
� Регулярно освежайте материал в памяти с помощью конспектов к лекциям, видеолекций и других
удобных вам материалов


Что будет на уроке сегодня

� Повторим теорию базовых определений ООП - абстракция, наследование
� Получим практические навыки в построении абстрактных сущностей и интерфейсов
� Научимся правильно использовать абстрактные классы и интерфейсы


_________________________________

			    Абстрактный класс
			          /
---------------------/----------
	    Обязан реализовывать все 
	    абстрактные методы
-----------------/--------------
		        /
Обычный класс наследник
_________________________________


____________________________________________________________________________________

				                Абстрактный класс
_________________________________/_____________\___________________________________
			                	/	     |	    \
	         Модификатор ’abstract’      |	Не может быть неизменяемым
----------------------------/------------|----------\--------------------------------
			               /    		 |	         \
Может содержать абстрактные методы   	 |	Не можем создать объект этого класса
      (методы без реализации)	    	 |
_________________________________________|__________________________________________



00:13:30
________________________________________________________________________________________

				                      Интерфейс
_____________________________________/_________\________________________________________
				                    /	  |	    \					
	        Ключевое слово ’interface’    |	    Все переменные и методы ’public’ 	
-------------------------------/----------|--------\------------------------------------
				              /        	  |	        \					
Может содержать методы без реализации	  |	    Не можем создать объект этого интерфейса
		(абстрактные методы)	          |	            \
-----------------------/------------------|--------------\------------------------------
			          /            		  |		          \				
Разрешено множественное наследование 	  |	    Не может наследоваться от класса
(имплементация любого числа интерфейсов)  |		            |	
--------------------|---------------------|-----------------|----------------------------
		            |              		  |		            |
Не может содержать конструкторы      	  |	    Все переменные статичны и неизменны
__________________________________________|_____________________________________________



00:16:15

Отличия интерфейса от абстрактнного класса
(абстрактный класс - предшественник интерфейса)

_______________________________________________________________

			             Абстрактный класс
___________________________/_________\_________________________
			              / 	|     \
 Может содержать абстрактные 	|	Может содержать
 и не абстрактные методы    	|	изменяемые переменные
-------------------/------------|----------\-------------------
	              /   			|		    \
        Может содержать  		|	Простые классы наследуются
    не статичные переменные	    |	от него через "extends"
--------------------------------|------------------------------
			                	|
		            Может наследовать свойства 
		            одного абстрактного класса
--------------------------------|------------------------------
                                |
	        Может реализовывать несколько интерфейсов
		        без обязательной реализации методов
_______________________________________________________________
_______________________________________________________________

				            Интерфейс
____________________________/_______\__________________________
				           /	|    \
	   Может содержать, только 	|	Может содержать, только
	   методы без реализации	|	неизменяемые переменные
------------------/-------------|--------------\---------------
		         /	    		|	        	\
	   Может содержать, только	|	Простые классы реализуют
	   статичные переменные		|	интерфейс через "implements"
--------------------------------|-------------------------------
					            |
			        Не может наследовать свойства 
			    	    абстрактного класса
--------------------------------|-------------------------------
	                            |
			          Может наследовать свойства 
				        нескольких интерфейсов
________________________________________________________________


00:18:00

Роман Сухачев

Использование абстрвктных классов рекомендуется тогда, когда
нужна базовая реализация и методы с реализации (?).

Использование интерфейсов больше подходит, когда нужно, чтобы 
некоторые классы могли предоставить свою реализацию 
для набора методов, без обязательств наследовать от одного класса.

Наследование от класса накладывает ограничения на класс (?), т.к.
нет возможности наследоваться от другого класса, в то время, как
интерфейсов можно наследовать неограниченное количество.


00:20:00

Если в процессе написания программы, стал выбор между использованием 
интерфейса или абстрактного класса, то, в случае, когда 
нужно связать классы между собой в некую структуру, 
либо между ними уже есть какая-то связь, например, логическая,
рекомендуется использовать абстрактный класс.


00:21:00

Примеры в коде:

*/

package OOP.Seminar.Sem02.Ex00;

/**
 * Если класс "Info" наследует (extends) 
 * какой-то класс "ExternInfo", то
 * "Info" уже не может наследовать ещё какой-нибудь класс, 
 * например, "TextInfo", будет выводится ошибка.
 */
public class Info extends ExternInfo /* TextInfo */ {
    
}

/**
 * ExternInfo (Extern - значит внешний)
 * Наследовать интерфейс какой-либо класс может многократно,
 * ошибки не возникает, число наследований интерфейсов неограничено
 */
class ExternInfo implements InnerInfo, InnerInfo1 {
 
}

/**
 * TextInfo
 * Можно наследовать (extends) какой-то класс, 
 * одновременно наследуя (implements) интерфейс(ы)
 */
class TextInfo extends Info implements InnerInfo2, InnerInfo3 {
  
}

/**
 * InnerInfo
 * "public" перед "interface" не пишется, т.к.
 * интерфейс (interface) по умолчанию (default) публичен (public)
 */
interface InnerInfo {
    
}

/**
 * InnerInfo1
 */
interface InnerInfo1 {
 
}

/**
 * InnerInfo2
 */
interface InnerInfo2 {

}

/**
 * InnerInfo3
 */
interface InnerInfo3 {

}

/*
00:39:00

Роман Сухачев 
Сылка на GitHub:
https://github.com/besSmertniyKoder/bstractions

 */
