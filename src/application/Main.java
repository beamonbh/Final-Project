package application;
	
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@FXML Button NewGame;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("FinalScene.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

	}
	@FXML
	public void StartGame(ActionEvent event){
		Stage stage = (Stage) NewGame.getScene().getWindow();
		stage.close();
		Game.play();
		
	} 
}
