package OOP.Seminar.Sem04.Task2;

// import java.util.List;

/*
 Создайте обобщенный класс Product<T>, который представляет товар в интернет-магазине.
 Каждый товар должен иметь параметр типа T для его названия.
 Создайте обобщенный класс Order<K, V>, который представляет заказ в интернет-магазине.
 Каждый заказ должен содержать параметры типов K для номера заказа и V для списка товаров.
 Создайте класс OnlineStore, который будет представлять интернет-магазин.
 У этого класса должны быть методы для добавления товаров и оформления заказов.
 Добавьте метод для вывода информации о всех заказах в магазине
 */
public class Main {
public static void main(String[] args) {

    OnlineStore<String, Integer, String> store = new OnlineStore<>();

    store.addProd(new Product<>("shirt", 400.99));
    store.addProd(new Product<>("dress", 100.99));
    // System.out.println(store);

    Order<Integer, String> order1 = new Order<Integer, String>(1111);
    Order<Integer, String> order2 = new Order<Integer, String>(2222);
    
    order1.setListProd("shirt");
    order2.setListProd("dress");
    store.createOrder(order1);
    store.createOrder(order2);

    System.out.println(store);
    }
}
