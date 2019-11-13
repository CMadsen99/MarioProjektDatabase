package Model;

import java.util.ArrayList;
import Data.Menu;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class MainMenuList {
   
    ArrayList<Pizza> menuList;
    
    public MainMenuList() throws ClassNotFoundException, SQLException {
        menuList = new ArrayList<>();
        fillListFromDB();
    }

    public ArrayList<Pizza> getMenuList() {
        return menuList;
    }
    
    public void fillListFromDB() throws ClassNotFoundException, SQLException {
        menuList = Menu.menuList();
    }
    
}
