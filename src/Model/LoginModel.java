package Model;
/**
 *
 * @author DELL
 */
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginModel {
    Statement stmt;
    ResultSet rs;

    public ResultSet searchLogin() {
        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT name, password FROM registration");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
