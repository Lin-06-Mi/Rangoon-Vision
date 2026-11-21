package RVController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class UserMainController implements Initializable{

    @FXML
    private BorderPane mainPane;

    @FXML
    private ImageView imgView;

    @FXML
    private Label lblLogoTitle1;

    @FXML
    private Button btnprofile;

    @FXML
    private ScrollPane homepane;

    @FXML
    private TextField txtsearch;

    @FXML
    private Button btnmode;
    
    @FXML
    private Button btnHome;

    @FXML
    private Button btnRoute;

    @FXML
    private Button btnFav;

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

    public void loadCenterView(String fxmlPath) throws IOException {
    	Parent view=FXMLLoader.load(getClass().getResource(fxmlPath));
    	mainPane.setCenter(view);
    }
    @FXML
    void clickmode(ActionEvent event) {

    }
    @FXML
    void clickprofile(ActionEvent event) throws IOException {
    	loadCenterView("/view/profile.fxml");
    }

    @FXML
    void clickFav(ActionEvent event) throws IOException {
    	loadCenterView("/view/UserDashboard_Route_BusStop.fxml");
    }

    @FXML
    void clickHome(ActionEvent event) throws IOException {
        loadCenterView("/view/UserDashboardHome.fxml");
    }

    @FXML
    void clickRoute(ActionEvent event) throws IOException {
    	loadCenterView("/view/UserDashboard_Route.fxml");
    	
    }


    @FXML
    void clicksearch(ActionEvent event) {

    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}


    

    

