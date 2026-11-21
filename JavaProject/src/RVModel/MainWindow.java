package RVModel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import RVModel.MainWindow;

public class MainWindow extends Application{

    public static Stage primaryStage;
	

	public static Stage getPrimaryStage() {
		return primaryStage;
	}
 
	public static void setPrimaryState(Stage primaryStage) {
		MainWindow.primaryStage = primaryStage;
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		this.primaryStage=stage;
		Parent root=FXMLLoader.load(getClass().getResource("/view/UserDashboard.fxml"));
		Scene scene=new Scene(root);
		scene.getStylesheets().add(getClass().getResource("/RVmodel/design.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

    


}

