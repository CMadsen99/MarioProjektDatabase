package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author christianmadsen & jacobsimonsen & jonasjørgensen 
 */
public class DBConnector {
    
    public static Connection getConnector() throws ClassNotFoundException, SQLException {
		Connection connector = null;
		String url = "jdbc:mysql://localhost:3306/mariopizza?";
		url += "serverTimezone=UTC&allowPublicKeyRetrieval=true&";
		url += "useSSL=false";
		String user = "root";
		String password = "Cph26767";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connector = DriverManager.getConnection(url,user,password);
		
		return connector;
	}
    
}
