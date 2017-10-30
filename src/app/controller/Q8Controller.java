package app.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Q8Controller {

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
	private JFXTextField titleField;

	@FXML
	void initialize() {
		assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'Q8Screen.fxml'.";
		assert resetBtn != null : "fx:id=\"resetBtn\" was not injected: check your FXML file 'Q8Screen.fxml'.";
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'Q8Screen.fxml'.";
		assert titleField != null : "fx:id=\"titleField\" was not injected: check your FXML file 'Q8Screen.fxml'.";

		resetBtn.setOnAction(e -> clear());
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

	public void setResetBtn(Button resetBtn) {
		this.resetBtn = resetBtn;
	}

	public JFXButton getStartBtn() {
		return startBtn;
	}

	public void setStartBtn(JFXButton startBtn) {
		this.startBtn = startBtn;
	}

	public JFXTextField getTitleField() {
		return titleField;
	}

	public void setTitleField(JFXTextField titleField) {
		this.titleField = titleField;
	}

	public void clear() {
		titleField.setText("");
	}
}
