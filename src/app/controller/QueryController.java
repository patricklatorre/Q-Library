package app.controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class QueryController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private BorderPane outline;

	@FXML
	private JFXButton q1btn;

	@FXML
	private JFXButton q2btn;

	@FXML
	private JFXButton q3btn;

	@FXML
	private JFXButton q4btn;

	@FXML
	private JFXButton q5btn;

	@FXML
	private JFXButton q6btn;

	@FXML
	private JFXButton q7btn;

	@FXML
	private JFXButton q8btn;

	@FXML
	private JFXButton q9btn;

	@FXML
	void initialize() {
		assert outline != null : "fx:id=\"outline\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q1btn != null : "fx:id=\"q1btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q2btn != null : "fx:id=\"q2btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q3btn != null : "fx:id=\"q3btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q4btn != null : "fx:id=\"q4btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q5btn != null : "fx:id=\"q5btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q6btn != null : "fx:id=\"q6btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q7btn != null : "fx:id=\"q7btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q8btn != null : "fx:id=\"q8btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";
		assert q9btn != null : "fx:id=\"q9btn\" was not injected: check your FXML file 'QueryScreen.fxml'.";

		q1btn.setAlignment(Pos.BASELINE_LEFT);
		q2btn.setAlignment(Pos.BASELINE_LEFT);
		q3btn.setAlignment(Pos.BASELINE_LEFT);
		q4btn.setAlignment(Pos.BASELINE_LEFT);
		q5btn.setAlignment(Pos.BASELINE_LEFT);
		q6btn.setAlignment(Pos.BASELINE_LEFT);
		q7btn.setAlignment(Pos.BASELINE_LEFT);
		q8btn.setAlignment(Pos.BASELINE_LEFT);
	}

	public BorderPane getOutline() {
		return outline;
	}

	public void setOutline(BorderPane outline) {
		this.outline = outline;
	}

	public JFXButton getQ1btn() {
		return q1btn;
	}

	public void setQ1btn(JFXButton q1btn) {
		this.q1btn = q1btn;
	}

	public JFXButton getQ2btn() {
		return q2btn;
	}

	public void setQ2btn(JFXButton q2btn) {
		this.q2btn = q2btn;
	}

	public JFXButton getQ3btn() {
		return q3btn;
	}

	public void setQ3btn(JFXButton q3btn) {
		this.q3btn = q3btn;
	}

	public JFXButton getQ4btn() {
		return q4btn;
	}

	public void setQ4btn(JFXButton q4btn) {
		this.q4btn = q4btn;
	}

	public JFXButton getQ5btn() {
		return q5btn;
	}

	public void setQ5btn(JFXButton q5btn) {
		this.q5btn = q5btn;
	}

	public JFXButton getQ6btn() {
		return q6btn;
	}

	public void setQ6btn(JFXButton q6btn) {
		this.q6btn = q6btn;
	}

	public JFXButton getQ7btn() {
		return q7btn;
	}

	public void setQ7btn(JFXButton q7btn) {
		this.q7btn = q7btn;
	}

	public JFXButton getQ8btn() {
		return q8btn;
	}

	public void setQ8btn(JFXButton q8btn) {
		this.q8btn = q8btn;
	}

	public JFXButton getQ9btn() {
		return q9btn;
	}

	public void setQ9btn(JFXButton q9btn) {
		this.q9btn = q9btn;
	}
}
