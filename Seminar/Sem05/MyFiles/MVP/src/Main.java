// package OOP.Seminar.Sem05.MVP.src;

import controller.OnlineStoreController;
import modelORdata.Orders;
import modelORdata.Shwarma;
import view.StoreView;

public class Main {
    public static void main(String[] args) {
        OnlineStoreController onlineStoreController =new OnlineStoreController();
        StoreView storeView = new StoreView();
        System.out.println("////////////////");
        storeView.addOrder(new Shwarma(1000, "мясо"));
        storeView.showOrders();
        System.out.println();
        Orders orders = new Orders();
        Shwarma shwarma = new Shwarma(90, "что нибудь");
        Object o1 = orders;
        Object o2 = shwarma;
        System.out.println("////////////////");
        if (o1 instanceof Shwarma){
            System.out.println("шаурма");
        }else {
            System.out.println("не шаурма :(");
        }

    }
}
