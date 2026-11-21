module JavaProject {
	
	exports RVController;
	exports RVModel;
	
	requires java.desktop;
	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
		
	    
	    opens RVController to javafx.fxml;
	    opens RVModel to javafx.base;
	    //opens view to javafx.fxml;
	} 
