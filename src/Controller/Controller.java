package Controller;

import Model.MainMenuList;
import Presentation.MainMenu;
import Model.OrderList;
import Data.OrderUpload;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jacobsimonsen
 */
public class Controller {

    public static void runProgram() throws ClassNotFoundException, SQLException {
        int input = 0;
        int exitValue = 9;
        int ordernumber = OrderUpload.orderNumberCheck();
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
                    CaseMethods.caseFour();
                    break;
                case 5:
                    //Ordrehistorik
                    CaseMethods.caseFive();
                    break;
                case 6:
                    //Se statistik  
                    CaseMethods.caseSix();
                    break;
                default:
                    //Afslut
                    System.out.println("Afslut");
                    input = exitValue;
            }
        }
    }
}
