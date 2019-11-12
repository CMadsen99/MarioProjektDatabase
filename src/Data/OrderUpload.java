package Data;

import Model.Order;
import Model.Pizza;
import Util.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class OrderUpload {

    public static void writeOrderToDB(Order order) throws ClassNotFoundException, SQLException {

        Connection myConnector = null;
        PreparedStatement st = null;
        ResultSet resultSet = null;

        String query = "INSERT INTO orders ("
                + " line,"
                + " order_id,"
                + " pickup_time,"
                + " pizza_id ) VALUES ("
                + "NULL, ?, ?, ?)";

        myConnector = DBConnector.getConnector();
        st = myConnector.prepareStatement(query);
        for (Pizza pizza : order.getPizzaer()) {
            st.setInt(1, order.getOrdrenummer());
            st.setString(2, order.getAfhentningsTidspunkt());
            st.setInt(3, pizza.getNummer());
            st.executeUpdate();
            //break;
        }
        st.close();
    }

}
