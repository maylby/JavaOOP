/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493


Схема работы алгоритма
________________________

        Presenter
	    /  /\  \
-------/--/--\--\-------
      /  /    \  \
Changed /	   \  Even
  |	   /	    \	 |
  | Update	  Update |
--|--/------------\--|--
  | /		       \ |
Model 		       View
________________________

*/
package OOP.Lesson.Les05.Ex001;

/*
 * Клиенский код (приложение)
 */
public class Program {
    public static void main(String[] args) {

        // var m = new SumModel();
        // var v = new View();  // "SumModel" и "View" можно передать, 
                                // минуя переменные (m, v), сразу в "Present",
                                // исключив две строки кода (var m, var v)
        // Present p = new Present(m, v);
        // p.buttonClick();

	    /*
         * две первые выше идущие строки исключены,
         * значения помещены в "Presenter" и переданы переменной "р", 
         * команда "buttonClick" размножена, 
         * пользователю предоставлена возможность
         * повторять цикл неограниченное число раз, 
         * вводить значения, кликать "button", получая результат (сумму)
	     */ 
        Presenter p = new Presenter(new SumModel(), new View()); // "View" отвечает за то, как
								                                 // выглядит вывод на экран
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
