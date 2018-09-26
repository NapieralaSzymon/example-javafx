package pl.wercia.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.wercia.example.javafx.controller.MainController;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Example JavaFX");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/view/Main.fxml"));
		Pane mainPane = loader.<Pane>load();
		MainController controller = loader.<MainController>getController();
		controller.setTextFieldValue("Podaj imię");
		Scene mainScene = new Scene(mainPane);
		mainScene.getStylesheets().add(getClass().getResource("/view/css/main.css").toExternalForm());
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
