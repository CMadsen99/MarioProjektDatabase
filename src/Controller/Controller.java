package Controller;

import Model.MainMenuList;
import Presentation.MainMenu;
import Presentation.MenuUI;
import Model.Order;
import Model.OrderList;
import Data.OrderHistory;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Controller {
    
    public static void runProgram() throws ClassNotFoundException, SQLException {
        int input = 0;
        int exitValue = 9;
        int ordernumber = 1;
        Scanner myScan = new Scanner(System.in);
        MainMenuList menuList = new MainMenuList();
        OrderList orderlist = new OrderList();

        while (input != exitValue) {
            MainMenu.showOptions();
            input = myScan.nextInt();
            switch (input) {
                case 1:
                    //Opret ordre
                    CaseMethods.caseOne(orderlist, ordernumber);
                    ordernumber++;
                    break;
                case 2:
                    //Fjern ordre
                    CaseMethods.caseTwo(orderlist);
                    break;
                case 3:
                    //Se aktuel liste
                    CaseMethods.caseThree(orderlist);
                    break;
                case 4:
                    //Se menukort
                    MenuUI.viewMenuList(menuList);
                    break;
                case 5:
                    //Ordrehistorik
                    OrderHistory.printOrderHistory();
                    break;
                case 6:
                    //Se statistik  
                    
                    break;
                default:
                    //Afslut
                    System.out.println("Afslut");
                    input = exitValue;
            }
        }
    }
}
