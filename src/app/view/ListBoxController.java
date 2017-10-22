package app.view;

import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ListBoxController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private AnchorPane screen;

	@FXML
	private JFXListView<?> list;

	@FXML
	private Label header;

	@FXML
	void initialize() {
		assert screen != null : "fx:id=\"screen\" was not injected: check your FXML file 'ListBox.fxml'.";
		assert list != null : "fx:id=\"list\" was not injected: check your FXML file 'ListBox.fxml'.";

	}

	public AnchorPane getScreen() {
		return screen;
	}

	public void setScreen(AnchorPane screen) {
		this.screen = screen;
	}

	public JFXListView<?> getList() {
		return list;
	}

	public void setList(JFXListView<?> list) {
		this.list = list;
	}

	public Label getHeader() {
		return header;
	}

	public void setHeader(Label header) {
		this.header = header;
	}
}
