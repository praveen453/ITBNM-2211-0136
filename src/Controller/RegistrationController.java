package Controller;
/**
 *
 * @author DELL
 */
import Model.RegistrationModel;
import View.Registration;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistrationController {
    private final Registration view;

    public RegistrationController(Registration view) {
        this.view = view;
    }

    public void createButtonActionPerformed(ActionEvent evt) {
        String name = view.getFirstNameTextField();
        String email = view.getEmailTextField();
        String mobile = view.getMobileNumberTextField();
        String password = view.getPasswordField();

        if ("".equals(name) || "".equals(email) || "".equals(mobile)) {
            JOptionPane.showMessageDialog(view, "Please enter valid details");
        } else {
            try {
                RegistrationModel.createRegistration(name, email, mobile, password);
                view.tbload();
                JOptionPane.showMessageDialog(view, "Registration successful");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(view, "Error: Please check details again");
            }
        }
    }

    public void deleteButtonActionPerformed(ActionEvent evt) {
        String name = view.getFirstNameTextField();
        try {
            RegistrationModel.deleteRegistration(name);
            view.tbload();
            JOptionPane.showMessageDialog(view, "Deletion successful");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(view, "Error: Please check again");
        }
    }

    public void editButtonActionPerformed(ActionEvent evt) {
        String name = view.getFirstNameTextField();
        String number = view.getMobileNumberTextField();
        String password = view.getPasswordField();
        String email = view.getEmailTextField();

        try {
            RegistrationModel.updateRegistration(name, number, password, email);
            view.tbload();
            JOptionPane.showMessageDialog(view, "Update successful");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(view, "Error: Please enter password and Donot edit email address");
        }
    }
}
