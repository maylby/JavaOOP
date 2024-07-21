/*
Объектно-ориентированное программирование (лекции)
Урок 5. ООП: От простого к практике
https://gb.ru/lessons/414493

*/
package OOP.Lesson.Les05.Ex001;

/*
* Модуль суммирования (SumModel), наследующий
* (extends) абстрактный класс "CalcModel"
*/
public class SumModel extends CalcModel {

    public SumModel() {
      
    }

    // метод получения суммы чисел x, y
    // do_it
    @Override
    public int result() {
        return x + y; 
    }
    
    // Метод задаёт значение "х" 
    @Override
    public void setX(int value) {
        super.x = value;
    }

    // Метод задаёт значение "у" 
    @Override
    public void setY(int value) {
        super.y = value;
    }
}

