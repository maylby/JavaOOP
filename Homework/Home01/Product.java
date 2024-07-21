/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496/homework

Практическое задание 1

 */
package OOP.Homework.Home01;

public class Product {

    private String name;
    private int volume;
    private int termo;
    private double cost;

    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public double getVolume() {
        return volume;
    }
        
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTermo() {
        return termo;
    }
        
    public void setTermo(int termo) {
        this.termo = termo;
    }

    public double getCost() {
        return cost;
    }
        
    public void setCost(double cost) {
        this.cost = cost;
    }
        
    public Product(String name, int volume, int termo, double cost) {
        this.name = name;
        this.volume = volume;
        this.termo = termo;
        this.cost = cost;
    }
    
    /*
     * Переопределение метода
     * для выдачи сведений о продукте
     * в понятной потребителю форме
     */
    @Override
    public String toString() {
        return "Product {" +
        "name: '" + name + '\'' +
        ", volume: " + volume + 
        ", temperature: " + termo +
        ", cost: " + cost +
        '}';
    }
}
