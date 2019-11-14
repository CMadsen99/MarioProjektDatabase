package Controller;

import Data.Menu;
import Data.OrderHistory;
import Model.Order;
import Model.OrderList;
import Model.Pizza;
import Data.OrderUpload;
import Data.Statistics;
import Model.MainMenuList;
import Presentation.MenuUI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author christianmadsen & jacobsimonsen & jonasjørgensen 
 */
public class CaseMethods {

    public static void caseOne(OrderList orderlist, int ordernumber) throws ClassNotFoundException, SQLException {
        Pizza tempPizza;
        String tempAT = "";
        Scanner myScan = new Scanner(System.in);
        ArrayList<Pizza> pizzas = new ArrayList();
        Order order;

        System.out.println("Opretter bestilling\nVælg afhentningstidspunkt:");
        tempAT = myScan.next();
        myScan.nextLine();
        System.out.println("Vælg pizza:");

        order = new Order(pizzas, ordernumber, tempAT);

        while (myScan.hasNextInt()) {
            try {
                tempPizza = Menu.menuList().get(myScan.nextInt() - 1);
                myScan.nextLine();
                order.addPizza(tempPizza);
                System.out.println("Vælg ny pizza eller skriv nej for at afslutte bestilling");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Den valgte pizza findes ikke i menuen. Indtast nyt nummer");
            }
        }
        orderlist.addOrder(order);
        OrderUpload.writeOrderToDB(order);
        OrderUpload.writeOrderInfoToDB(order);
    }

    public static void caseTwo(OrderList orderlist) {
        Scanner myScan = new Scanner(System.in);
        int ordreInput;
        System.out.println("Hvilken bestilling skal fjernes?\nSkriv ordrenummer:");
        ordreInput = myScan.nextInt();
        myScan.nextLine();
        orderlist.removeOrder(ordreInput);
    }

    public static void caseThree(OrderList orderlist) {
        orderlist.showOrderList();
    }

    public static void caseFour() throws ClassNotFoundException, SQLException {
        MainMenuList menuList = new MainMenuList();
        MenuUI.viewMenuList(menuList);
    }

    public static void caseFive() throws ClassNotFoundException, SQLException {
        OrderHistory.printOrderHistory();
    }

    public static void caseSix() throws ClassNotFoundException, SQLException {
        Statistics.showMostPopular();
        System.out.println("");
        Statistics.showRevenueByDate();
    }
    
    public static void nextLine() {
        System.out.println("");
    }
}
