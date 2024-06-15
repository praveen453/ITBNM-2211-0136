package Controller;
/**
 *
 * @author DELL
 */
import Model.DBConnection;
import View.HomePage;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import View.LoginInterface;
import java.sql.SQLException;
import Model.LoginModel;

public class LoginController {
    private LoginInterface view;
    
    public LoginController(LoginInterface view) {
        this.view = view;
        this.view.setController(this);
    }
    
    /**
     *
     * @param username
     * @param password
     */
    public void workWithDatabase(String username, String password) {
    
        ResultSet rs = null;
    
        try {
            rs = new LoginModel().searchLogin();
            boolean found = false;
            
            while (rs.next()) {
                String ename = rs.getString("name");
                String pass = rs.getString("password");
                
                if (username.equals(ename) && password.equals(pass)) {
                    JOptionPane.showMessageDialog(view, "Login successfully");
                    view.setVisible(false);
                    HomePage homePage = new HomePage();
                    homePage.setVisible(true);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                JOptionPane.showMessageDialog(view, "Please enter valid details");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
