package RVController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RVHomeController {

    @FXML
    private TextField txtEmailPhnumber;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private CheckBox cbDriver;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Button clickLogin;

    @FXML
    private Hyperlink regLink;
    
    @FXML
    private VBox regPane;
    @FXML
    private ImageView imgbg;
    @FXML
    void btnLogin(ActionEvent event) {

    }

    @FXML
    void clickReg(ActionEvent event) throws IOException {
    	 Parent registerRoot = FXMLLoader.load(getClass().getResource("/view/RVRegisterPage.fxml"));
         Stage stage = (Stage) regLink.getScene().getWindow();
         stage.setScene(new Scene(registerRoot));
         stage.setTitle("Register");
         stage.show();
    }

	public void initialize(URL arg0, ResourceBundle arg1) {
		//imgbg.setImage(new Image("file:///J:/16G/JavaProject/image/background.jpg"));
		
	}

}


