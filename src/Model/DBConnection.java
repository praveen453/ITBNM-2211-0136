package Model;
/**
 *
 * @author DELL
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
 private static Connection conn;

    public static Statement getStatementConnection() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            try {
                
                Class.forName("com.mysql.jdbc.Driver");
                
                String url = "jdbc:mysql://localhost:3306/java_booking";
                String user = "root";
                String password = "";
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
                throw e;
            }
        }
        return conn.createStatement();
    }

    public static void closeCon() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   
}

