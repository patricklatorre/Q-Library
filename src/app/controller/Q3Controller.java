package app.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Q3Controller {

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
	private JFXTextField firstField;

	@FXML
	private JFXTextField lastField;

	@FXML
	void initialize() {
		assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'Q3Screen.fxml'.";
		assert resetBtn != null : "fx:id=\"resetBtn\" was not injected: check your FXML file 'Q3Screen.fxml'.";
		assert startBtn != null : "fx:id=\"startBtn\" was not injected: check your FXML file 'Q3Screen.fxml'.";
		assert firstField != null : "fx:id=\"firstField\" was not injected: check your FXML file 'Q3Screen.fxml'.";
		assert lastField != null : "fx:id=\"lastField\" was not injected: check your FXML file 'Q3Screen.fxml'.";

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

	public JFXTextField getFirstField() {
		return firstField;
	}

	public void setFirstField(JFXTextField firstField) {
		this.firstField = firstField;
	}

	public JFXTextField getLastField() {
		return lastField;
	}

	public void setLastField(JFXTextField lastField) {
		this.lastField = lastField;
	}
}
