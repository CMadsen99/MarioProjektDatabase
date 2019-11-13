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
public class Statistics {

    public static void showMostPopular() throws ClassNotFoundException, SQLException {

        int pizza_id = 0;
        int counter = 0;

        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT pizza_id, count(*) FROM order_info\n"
                + "    GROUP BY pizza_id\n"
                + "    ORDER BY COUNT(*) DESC\n"
                + "    LIMIT    1;";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);

        if (resultSet.next()) {
            pizza_id = resultSet.getInt("pizza_id");
            counter = resultSet.getInt("count(*)");
        }

        System.out.printf("Mest populære pizza:\nPizzanummer   Antal\n%5d%12d\n", pizza_id, counter);
        
        resultSet.close();
        statement.close();
        myConnector.close();
    }
}
