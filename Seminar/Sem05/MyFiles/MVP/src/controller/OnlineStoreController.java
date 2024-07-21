package controller;

import modelORdata.Shwarma;
import service.StoreService;

public class OnlineStoreController {
    private StoreService storeService = new StoreService();

    public OnlineStoreController() {}

    public void addOrder(Shwarma shwarma) {

        storeService.addOrder(shwarma);

    }

    public void seeOrders() {

        storeService.seeOrders();


    }


}
