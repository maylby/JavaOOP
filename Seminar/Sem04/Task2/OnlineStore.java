package OOP.Seminar.Sem04.Task2;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore<T, K, V> {

    private List<Product<T>> products;
    private int orderCounter;
    private List<Order<K, V>> orders;

    public OnlineStore() {
        products = new ArrayList<>();
        orders = new ArrayList<>();
        orderCounter = 0;
    }

    void addProd(Product<T> product) {
        products.add(product);
    }

    void createOrder(Order<K, V> order) {
        orders.add(order);
        orderCounter++;
    }

    @Override
    public String toString() {
        return "list = " + "№" + orderCounter + orders;
    }
}