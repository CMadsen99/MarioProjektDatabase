package Data;

import Util.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jacobsimonsen
 */
public class OrderHistory {

    public static void printOrderHistory() throws ClassNotFoundException, SQLException {
        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT o.order_id, o.pickup_time, o.date, sum(p.price)\n"
                + "FROM orders o, order_info i, pizzas p\n"
                + "WHERE o.order_id=i.order_id AND i.pizza_id=p.pizza_id\n"
                + "GROUP BY o.order_id;";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);

        int order_id = 0;
        String pickup_time = "";
        String date = "";
        double price = 0;
        
        System.out.println("Ordrenummer     Afhentning     Dato       Pris");
        
        while (resultSet.next()) {
            order_id = resultSet.getInt("order_id");
            pickup_time = resultSet.getString("pickup_time");
            date = resultSet.getString("date");
            price = resultSet.getDouble("sum(p.price)");

            System.out.printf("%5d %17s %14s %8.2f kr.\n", order_id, pickup_time, date, price);
        }

        resultSet.close();
        statement.close();
        myConnector.close();
    }

}
