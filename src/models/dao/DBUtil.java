package models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    public static Connection ConnectionString() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/EX_COMPUTER";
            String user = "root";
            String password = "Learn4car1$";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Driver found");
            System.out.println("Connect access");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Something went wrong in connection");
        }
        return connection;
    }
}
