package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Pizza;
import Util.DBConnector;

/**
 *
 * @author christianmadsen
 */
public class Menu {
    
    public static ArrayList<Pizza> menuList() throws ClassNotFoundException, SQLException {
        ArrayList<Pizza> returnList = new ArrayList<>();

        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM pizzas";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int pizza_id = resultSet.getInt("pizza_id");
            String pizza_name = resultSet.getString("pizza_name");
            String ingredients  = resultSet.getString("ingredients");
            double price = resultSet.getDouble("price");
            Pizza tempPizza = new Pizza(pizza_id, pizza_name, price, ingredients);
            returnList.add(tempPizza);            
        }

        resultSet.close();
        statement.close();
        myConnector.close();
        
        return returnList;
    }
    
}
