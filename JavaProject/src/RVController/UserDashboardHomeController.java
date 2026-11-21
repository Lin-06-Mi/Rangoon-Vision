package RVController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class UserDashboardHomeController {

    @FXML
    private TextField txtsearch;

    @FXML
    private Button btnmode;

    @FXML
    private Label lblActiveRouteNum;

    @FXML
    private Label lblActiveRouteName;

    @FXML
    private Label lblActiveEta;

    @FXML
    private Label lblActiveStatus;

    @FXML
    private Label lblDetailSubtitle;

    @FXML
    private Label lblStopsCount;

    @FXML
    private VBox vboxTimelineStops;

    @FXML
    private VBox upcomingBusesContainer;

    @FXML
    void clickmode(ActionEvent event) {

    }

    @FXML
    void clicksearch(ActionEvent event) {

    }

}
