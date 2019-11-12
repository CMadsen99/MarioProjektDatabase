package Data;

import Util.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class OrderHistory {

    public static void printOrderHistory() throws ClassNotFoundException, SQLException {
        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "select o.order_id, o.pizza_id, p.pizza_name, p.price\n" +
"from orders o, pizzas p\n" +
"where o.pizza_id=p.pizza_id;";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);
        
        int order_id = 0;
        int pizza_id = 0;
        String pizza_name = "";
        double price = 0;
        System.out.println("Ordrenummer     Pizzanummer     Pizzanavn     Pris");
        while (resultSet.next()) {
            order_id = resultSet.getInt("order_id");
            pizza_id = resultSet.getInt("pizza_id");
            pizza_name = resultSet.getString("pizza_name");
            price = resultSet.getDouble("price");
            
            System.out.printf("%5d %16d %17s %9.2f kr.\n", order_id, pizza_id, pizza_name, price);
        }
        //lukker efter mig
        resultSet.close();
        statement.close();
        myConnector.close();
        
        
    }

}
