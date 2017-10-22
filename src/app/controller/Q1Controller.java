package app.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Q1Controller {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private AnchorPane screen;

	@FXML
	private Button resetBtn;

	@FXML
	private JFXButton startBtn;

	@FXML
	private JFXTextField publisherField;

	@FXML
	void initialize() {
		assert screen != null : "fx:id=\"q1Screen\" was not injected: check your FXML file 'Q1Screen.fxml'.";
		assert resetBtn != null : "fx:id=\"resetBtn\" was not injected: check your FXML file 'Q1Screen.fxml'.";
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'Q1Screen.fxml'.";
		assert publisherField != null : "fx:id=\"publisherField\" was not injected: check your FXML file 'Q1Screen.fxml'.";

		resetBtn.setOnAction(e -> clear());
	}

	public AnchorPane getScreen() {
		return screen;
	}

	public void setQ1Screen(AnchorPane screen) {
		this.screen = screen;
	}

	public Button getResetBtn() {
		return resetBtn;
	}

	public void setResetBtn(JFXButton resetBtn) {
		this.resetBtn = resetBtn;
	}

	public JFXButton getStartBtn() {
		return startBtn;
	}

	public void setStartBtn(JFXButton startBtn) {
		this.startBtn = startBtn;
	}

	public JFXTextField getPublisherField() {
		return publisherField;
	}

	public void setPublisherField(JFXTextField publisherField) {
		this.publisherField = publisherField;
	}

	public void clear() {
		publisherField.setText("");
	}
}
