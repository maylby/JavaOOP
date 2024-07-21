package service;

import modelORdata.Orders;
import modelORdata.Shwarma;

public class StoreService {
   private Orders orders = new Orders();
    public void addOrder(Shwarma shwarma){
        if (shwarma.getContains() == null| shwarma.getCost() <= 0){
            System.out.println("Неправильное имя!");
        }else {
            orders.add(shwarma);
            System.out.println("добавили в onlineStore " + shwarma);
        }



    }
    public void seeOrders(){
        if (orders != null){
            orders.getArrayList();
        } else {
            System.out.println("orders is null! no food for you");
        }

    }

}
