package app.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Q5Controller {

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
	void initialize() {
		assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'Q5Screen.fxml'.";
		assert resetBtn != null : "fx:id=\"resetBtn\" was not injected: check your FXML file 'Q5Screen.fxml'.";
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'Q5Screen.fxml'.";

	}

	public AnchorPane getScreen() {
		return screen;
	}

	public void setScreen(AnchorPane screen) {
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
}
