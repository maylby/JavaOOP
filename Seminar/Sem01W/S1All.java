/*
Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
https://gb.ru/lessons/414496


00:55:00

Задача 1
(Вариант-1 оформления решения в одном файле)
Данный вариант позволяет запустить код командой из терминала VSCode

Решение
(Сергей Пономарев)

 */
package OOP.Seminar.Sem01W;
/*
 * Реализуйте класс "Товар", содержащий данные о товаре, и "ТорговыйАвтомат",
 * содержащий в себе методы initProducts (List <Product>)
 * сохраняющий в себе список исходных продуктов и getProduct(String name) 
 */
import java.util.ArrayList;

public class S1All {
    public static void main(String[] args) {
        ArrayList<S1Product> prods = new ArrayList<>();
        prods.add(new S1Product("Хлеб", 40.0));
        prods.add(new S1Product("Молоко", 80.0));
        prods.add(new S1Product("Колбаса", 120.0));
        prods.add(new S1Product("Сыр", 150.0));
        
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.initProducts(prods);
        System.out.println(vendingMachine.getProduct("Сыр"));
    }
}

/*
 * Внесение наименования каждого продукта 
 * и его стоимости в общий список
 */
class S1Product {

    private String name;
    private double cost;

    public String getName() {
        return name;
    }
        
    public void setName(String name) {
        this.name = name;
    }
        
    public double getCost() {
        return cost;
    }
        
    public void setCost(double cost) {
        this.cost = cost;
    }
        
    public S1Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /*
     * Переопределение метода
     * для выдачи сведений о продукте
     * в понятной потребителю форме
     */
    @Override
    public String toString() {
        return "Product{" +
        "name: '" + name + '\'' +
        ", cost: " + cost +
        '}';
    }
}

/*
 * Передача списка продуктов с их стоимостью торговой машине
 */
class VendingMachine {
    private ArrayList<S1Product> products;
    
    public void initProducts(ArrayList<S1Product> products){
        this.products = products;
    }
    
    public S1Product getProduct(String prodName){
        for (S1Product p : products) {
            if (p.getName().equals(prodName)){
                return p;
            }
        }
        return null;
    }
}
