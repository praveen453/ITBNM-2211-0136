package Model;
/**
 *
 * @author DELL
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReceiptModel {
    public static void finishBooking(String movieId, String noOfTickets, String time, String date, String movie, String location, String price) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_booking", "root", "");
            Statement s = conn.createStatement();
            String query = String.format("INSERT INTO booking_details VALUES('%s', '%s', '%s', '%s', '%s', '%s', '%s');", movieId, noOfTickets, time, date, movie, location, price);
            s.executeUpdate(query);
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ResultSet getReceiptData() throws SQLException, ClassNotFoundException {
        return DBConnection.getStatementConnection().executeQuery("SELECT * FROM booking_details");
    }
}
