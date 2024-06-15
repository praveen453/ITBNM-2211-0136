package Controller;
/**
 *
 * @author DELL
 */
import Model.ReceiptModel;
import View.HomePage;
import View.Receipt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ReceiptController {
    private Receipt view;

    public ReceiptController(Receipt view) {
        this.view = view;
        tbload();
    }


    public void tbload() {
        try {
            DefaultTableModel dt = (DefaultTableModel) view.getjTable1().getModel();
            dt.setRowCount(0);
            ResultSet rs = ReceiptModel.getReceiptData();
            while (rs.next()) {
                Vector<Object> row = new Vector<>();
                for (int i = 1; i <= 7; i++) {
                    row.add(rs.getObject(i));
                }
                dt.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException e) {
            Logger.getLogger(ReceiptController.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void finishButtonClicked() {
        String movieId = view.getMovieId();
        String noOfTickets = view.getNoOfTickets();
        String time = view.getTime();
        String date = view.getDate();
        String movie = view.getMovie();
        String location = view.getLocationText();
        String price = view.getPrice();

        ReceiptModel.finishBooking(movieId, noOfTickets, time, date, movie, location, price);
        tbload();
    }

    public void BackToHome() {
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        view.setVisible(false);
    }

}
