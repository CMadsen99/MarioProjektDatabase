package Data;

import Model.Order;
import Model.Pizza;
import Util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class OrderUpload {

    public static void writeOrderToDB(Order order) throws ClassNotFoundException, SQLException {
        Connection myConnector = null;
        PreparedStatement st = null;
        ResultSet resultSet = null;

        LocalDate date = LocalDate.now();

        String query = "INSERT INTO orders ("
                + " order_id,"
                + " pickup_time,"
                + " date ) VALUES ("
                + "NULL, ?, ?)";

        myConnector = DBConnector.getConnector();
        st = myConnector.prepareStatement(query);
        st.setString(1, order.getAfhentningsTidspunkt());
        st.setString(2, date.toString());
        st.executeUpdate();
        
        st.close();
    }

    public static void writeOrderInfoToDB(Order order) throws ClassNotFoundException, SQLException {
        Connection myConnector = null;
        PreparedStatement st = null;
        ResultSet resultSet = null;

        String query = "INSERT INTO order_info ("
                + " order_id,"
                + " pizza_id ) VALUES ("
                + "?, ?)";

        myConnector = DBConnector.getConnector();
        st = myConnector.prepareStatement(query);
        for (Pizza pizza : order.getPizzaer()) {
            st.setInt(1, order.getOrdrenummer());
            st.setInt(2, pizza.getNummer());
            st.executeUpdate();
        }
        
        st.close();
    }

    public static int orderNumberCheck() throws ClassNotFoundException, SQLException {
        int retVal = 0;

        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT MAX(order_id) as result FROM orders";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            retVal = resultSet.getInt("result") + 1;
        }

        resultSet.close();
        statement.close();
        myConnector.close();
        
        return retVal;
    }

}
