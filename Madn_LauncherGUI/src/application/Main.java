package application;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import application.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MADN_Launcher.fxml"));
        Parent root = fxmlLoader.load();
        MADN_LaucherController gameController = fxmlLoader.getController();
        gameController.initSelectUI();

        primaryStage.setTitle("Mensch �rgere Dich nicht");
        primaryStage.setScene(new Scene(root, 600, 450));
        primaryStage.show();
    }

     
    public static void main(String[] args) {
        launch(args);
    }
}
