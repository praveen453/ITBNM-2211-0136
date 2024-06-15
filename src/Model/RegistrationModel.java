package Model;
/**
 *
 * @author DELL
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class RegistrationModel {
    public static void createRegistration(String name, String email, String mobile, String password) throws SQLException {
        try {
            Statement s = DBConnection.getStatementConnection();
            String query = "INSERT INTO registration (name, email, mobile_num, password) "+ "VALUES ('" + name + "','" + email + "','" + mobile + "','" + password + "')";
            s.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteRegistration(String name) throws SQLException {
        try {
            Statement s = DBConnection.getStatementConnection();
            String query = "DELETE FROM registration WHERE name = '" + name + "'";
            s.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateRegistration(String name, String mobile, String password, String email) throws SQLException {
        try {
            Statement s = DBConnection.getStatementConnection();
            String query = "UPDATE registration SET name ='" + name + "', mobile_num ='" + mobile + "',password ='" + password + "' WHERE email ='" + email + "'";
            s.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DefaultTableModel loadRegistrationData() throws SQLException {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Mobile");

        try {
            Statement s = DBConnection.getStatementConnection();
            ResultSet rs = s.executeQuery("SELECT * FROM registration");

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile_num");

                model.addRow(new Object[]{name, email, mobile});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return model;
    }
}
