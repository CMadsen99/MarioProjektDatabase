package Presentation;

import Model.MainMenuList;
import Model.Pizza;

/**
 *
 * @author jonasjørgensen
 */
public class MenuUI {
    
    public static void viewMenuList(MainMenuList menuList) {
        for (Pizza pizza : menuList.getMenuList()) {
            System.out.println(pizza.toString());
        }
    }
    
}
