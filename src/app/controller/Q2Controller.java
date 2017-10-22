package app.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Q2Controller {

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
	private JFXDatePicker startDate;

	@FXML
	private JFXDatePicker endDate;

	@FXML
	void initialize() {
		assert screen != null : "fx:id=\"q1Screen\" was not injected: check your FXML file 'Q2Screen.fxml'.";
		assert resetBtn != null : "fx:id=\"resetBtn\" was not injected: check your FXML file 'Q2Screen.fxml'.";
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'Q2Screen.fxml'.";
		assert startDate != null : "fx:id=\"startDate\" was not injected: check your FXML file 'Q2Screen.fxml'.";
		assert endDate != null : "fx:id=\"endDate\" was not injected: check your FXML file 'Q2Screen.fxml'.";

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

	public JFXDatePicker getStartDate() {
		return startDate;
	}

	public void setStartDate(JFXDatePicker startDate) {
		this.startDate = startDate;
	}

	public JFXDatePicker getEndDate() {
		return endDate;
	}

	public void setEndDate(JFXDatePicker endDate) {
		this.endDate = endDate;
	}
}
