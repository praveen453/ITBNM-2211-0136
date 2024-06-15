package Model;
/**
 *
 * @author DELL
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MovieModel {
    public void saveMovieDetails(String movieId, String selectedMovie, String selectedLocation, String selectedDate, String selectedTime, String noOfTickets) throws SQLException, ClassNotFoundException {
        Statement stmt = DBConnection.getStatementConnection();
        String query = "INSERT INTO movie_details VALUES('" + movieId + "', '" + selectedMovie + "', '" + selectedLocation + "', '" + selectedDate + "', '" + selectedTime + "', '" + noOfTickets + "')";
        stmt.executeUpdate(query);
    }
    
     public static String AutoMovieId() throws SQLException, ClassNotFoundException {
        Statement stmt = DBConnection.getStatementConnection();
        ResultSet rs = stmt.executeQuery("SELECT MAX(movie_id) FROM movie_details");
        rs.next();
        String maxId = rs.getString(1);
        if (maxId == null) {
            return "M001";
        } else {
            long id = Long.parseLong(maxId.substring(1)) + 1;
            return "M" + String.format("%03d", id);
        }
    }
     
     public static void loadMovieDetails(DefaultTableModel dt) throws SQLException, ClassNotFoundException {
        try {
            dt.setRowCount(0);
            Statement s = DBConnection.getStatementConnection();
            ResultSet rs = s.executeQuery("SELECT * FROM movie_details");
            while (rs.next()) {
                Vector<Object> v = new Vector<>();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                v.add(rs.getString(6));
                dt.addRow(v);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
