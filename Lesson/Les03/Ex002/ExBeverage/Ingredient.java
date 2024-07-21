/*
Объектно-ориентированное программирование (лекции)
Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
https://gb.ru/lessons/414491

 */

package OOP.Lesson.Les03.Ex002.ExBeverage;

public abstract class Ingredient {
    public String brand;

    public Ingredient(String brand) {
        this.brand = brand;
    }

    /*
     * Метод "toString" 
     * переопределён для красоты (?)
     * Так сказано в лекции.
     * Для какой именно красоты?
     */
    @Override
    public String toString() {
        return brand;
    }
}
