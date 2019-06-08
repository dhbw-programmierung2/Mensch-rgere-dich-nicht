package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception  {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BeispielGUI.fmxl"));
		Parent root = fxmlLoader.load();
		Controller gameController = fxmlLoader.getController();
		gameController.initSelectUI();
		
		primaryStage.setTitle("Mensch ärgere Dich nicht");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
