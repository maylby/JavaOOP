package OOP.Seminar.Sem04.Task2;

import java.util.ArrayList;

public class Order<K, V> { // K number order, V list products
    private K number;
    private ArrayList<V> listProd = new ArrayList<>();

    public Order(K number) {
        this.number = number;
    }

    public ArrayList<V> getListProd() {
        return listProd;
    }

    public void setListProd(V product) {
        listProd.add(product);
    }

    @Override
    public String toString() {
        return " №:{" + number +
                " list = " + listProd +
                '}';
    }
}
