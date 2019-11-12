package Model;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class OrderList {

    private ArrayList<Order> orderList;

    public OrderList() {
        orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(int ordreNummer) {
        for (Order order : orderList) {
            if (ordreNummer == order.getOrdrenummer()) {
                orderList.remove(order);
                System.out.println("Ordrenummer: " + ordreNummer + " er fjernet fra listen");
            } else {
                System.out.println("Ordren findes ikke");
            }
            break;
        }
    }

    public void showOrderList() {
        String retVal = "";

        for (Order order : orderList) {
            retVal += order.toString() + "\n";
        }
        System.out.print(retVal);
    }
}
