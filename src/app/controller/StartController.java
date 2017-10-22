package app.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;

import java.net.URL;
import java.util.ResourceBundle;

public class StartController
{

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private JFXButton startBtn;

	@FXML
	void initialize() {
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'StartScreenStartScreen.fxml'.";

	}

	public JFXButton getStartBtn() {
		return startBtn;
	}

	public void setStartBtn(JFXButton startBtn) {
		this.startBtn = startBtn;
	}
}
