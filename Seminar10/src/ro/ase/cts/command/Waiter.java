package ro.ase.cts.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<FoodOrder> orders = new ArrayList<>();

    public void addOrder(FoodOrder order){
        orders.add(order);
    }

    public void sendOrders(){
        for (FoodOrder order:orders) {
            order.cook();
        }
        orders.clear();
    }

}
