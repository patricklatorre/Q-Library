package app.controller;

import app.Facade.DefaultQueryFacade;
import app.Facade.QueryFacadeV1;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class SuperController
{
	private DefaultQueryFacade queryMaster;

	public SuperController() {
		this.queryMaster = new QueryFacadeV1();
	}

	public void start() {
		FXMLLoader loader = new FXMLLoader();

		/*
		* APP WINDOW SETUP
		* */
		Stage window = new Stage();
		window.setTitle("Q-Library");
		window.setMinWidth(1280);
		window.setMinHeight(720);
		window.initModality(Modality.APPLICATION_MODAL); /* Blocks interaction with any parent windows */






		/* INITIALIZE SCENE
		 * Get Started
		 */
		loader = new FXMLLoader(getClass().getResource("/app/view/StartScreen.fxml"));
		Parent startLayout = null;
		try {
			startLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		StartController startController = loader.getController();
		Scene startScreen = new Scene(startLayout, 1280, 720);







		/* INITIALIZE SCENE
		 * Query Main Menu
		 */
		loader = new FXMLLoader(getClass().getResource("/app/view/QueryScreen.fxml"));
		Parent queryLayout = null;
		try {
			queryLayout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		QueryController queryController = loader.getController();
		Scene queryScreen = new Scene(queryLayout, 1280, 720);



		/*
		* Center Layout
		* Query 1
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q1Screen.fxml"));
		Parent q1Layout = null;
		try {
			q1Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q1Controller q1Controller = loader.getController();



		/*
		* Center Layout
		* Query 2
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q2Screen.fxml"));
		Parent q2Layout = null;
		try {
			q2Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q2Controller q2Controller = loader.getController();



		/*
		* Center Layout
		* Query 3
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q3Screen.fxml"));
		Parent q3Layout = null;
		try {
			q3Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q3Controller q3Controller = loader.getController();



		/*
		* Center Layout
		* Query 4
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q4Screen.fxml"));
		Parent q4Layout = null;
		try {
			q4Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q4Controller q4Controller = loader.getController();



		/*
		* Center Layout
		* Query 5
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q5Screen.fxml"));
		Parent q5Layout = null;
		try {
			q5Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q5Controller q5Controller = loader.getController();



		/*
		* Center Layout
		* Query 6
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q6Screen.fxml"));
		Parent q6Layout = null;
		try {
			q6Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q6Controller q6Controller = loader.getController();



		/*
		* Center Layout
		* Query 7
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q7Screen.fxml"));
		Parent q7Layout = null;
		try {
			q7Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q7Controller q7Controller = loader.getController();



		/*
		* Center Layout
		* Query 8
		* */
		loader = new FXMLLoader(getClass().getResource("/app/view/Q8Screen.fxml"));
		Parent q8Layout = null;
		try {
			q8Layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Q8Controller q8Controller = loader.getController();







		/*
		* SCREEN NAVIGATION
		* */
		queryController.getOutline().setCenter(q1Layout);


		Parent finalQ1Layout = q1Layout;
		queryController.getQ1btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ1Layout);
		});


		Parent finalQ2Layout = q2Layout;
		queryController.getQ2btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ2Layout);
		});


		Parent finalQ3Layout = q3Layout;
		queryController.getQ3btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ3Layout);
		});


		Parent finalQ4Layout = q4Layout;
		queryController.getQ4btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ4Layout);
		});


		Parent finalQ5Layout = q5Layout;
		queryController.getQ5btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ5Layout);
		});


		Parent finalQ6Layout = q6Layout;
		queryController.getQ6btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ6Layout);
		});


		Parent finalQ7Layout = q7Layout;
		queryController.getQ7btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ7Layout);
		});


		Parent finalQ8Layout = q8Layout;
		queryController.getQ8btn().setOnAction(e -> {
			queryController.getOutline().setCenter(finalQ8Layout);
		});






		/*
		* NON-NAVIGATION ACTION LISTENERS
		* */
		startController.getStartBtn().setOnAction(e -> {
			window.setScene(queryScreen);
		});


		q1Controller.getStartBtn().setOnAction(e -> {
			String publisherFilter = q1Controller.getPublisherField().getText(); // String inside textfield

			this.queryMaster.query1(publisherFilter);
		});


		q2Controller.getStartBtn().setOnAction(e -> {
			String startDateFilter;
			String endDateFilter;

			/* Chosen start date */
			startDateFilter = q2Controller.getStartDate().getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			/* Chosen end date */
			endDateFilter = q2Controller.getEndDate().getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

			this.queryMaster.query2(startDateFilter, endDateFilter);
		});


		q3Controller.getStartBtn().setOnAction(e -> {
			String authorFilter = q3Controller.getAuthorField().getText();		// String inside textfield

			this.queryMaster.query3(authorFilter);
		});


		q4Controller.getStartBtn().setOnAction(e -> {
			this.queryMaster.query4();
		});


		q5Controller.getStartBtn().setOnAction(e -> {
			this.queryMaster.query5();
		});


		q6Controller.getStartBtn().setOnAction(e -> {
			this.queryMaster.query6();
		});


		q7Controller.getStartBtn().setOnAction(e -> {
			this.queryMaster.query7();
		});


		q8Controller.getStartBtn().setOnAction(e -> {
			this.queryMaster.query8();
		});






		/*
		* WINDOW STARTUP
		* */

		window.setScene(startScreen);
		window.showAndWait();
	}


}
