package Controller;
/**
 *
 * @author DELL
 */
import Model.MovieModel;
import View.HomePage;
import View.MovieDetails;
import View.ConfirmDetails;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MovieDetailsController {
    private final MovieDetails view;
    private final MovieModel model;

    public MovieDetailsController(MovieDetails view, MovieModel model) {
        this.view = view;
        this.model = model;
        initController();
    }

    private void initController() {
        view.autoId();
        view.tbload();
        view.backButtonListener(e -> backButtonClicked());
    }

    public void submitButtonClicked(){
        String movieId = view.getMovieId();
        String selectedMovie = view.getSelectedMovie();
        String selectedLocation = view.getSelectedLocation();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String selectedDate = dateFormat.format(view.getSelectedDate());
        String selectedTime = view.getSelectedTime();
        String noOfTickets = view.getNoOfTickets();

        try {
            model.saveMovieDetails(movieId, selectedMovie, selectedLocation, selectedDate, selectedTime, noOfTickets);
            view.tbload();
            workWithDatabase(movieId, selectedMovie, selectedLocation, selectedDate, selectedTime, noOfTickets);
            view.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(MovieDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MovieDetailsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void backButtonClicked() {
        view.setVisible(false);
        new HomePage().setVisible(true);
    }

    public void workWithDatabase(String movieId, String selectedMovie, String selectedLocation, String selectedDate, String selectedTime, String noOfTickets) {
        int noOfTicketsInt = Integer.parseInt(noOfTickets);
        int cost = noOfTicketsInt * 100;

        if (noOfTicketsInt > 0 && noOfTicketsInt < 10) {
            view.setVisible(false);
            new ConfirmDetails(selectedMovie, selectedLocation, selectedDate, noOfTickets, cost, selectedTime, movieId).setVisible(true);
        }
    }
}
