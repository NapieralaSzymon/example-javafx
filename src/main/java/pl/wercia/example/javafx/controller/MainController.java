package pl.wercia.example.javafx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	private TextField textField;

	@FXML
	private Button button;

	@FXML
	private Label label;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		button.setOnAction(e -> label.setText(String.format("Cześć %s", textField.getText())));
	}

	public void setTextFieldValue(String value) {
		textField.setText(value);
	}

}
