package app;

import app.controller.SuperController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
		SuperController application = new SuperController();
        application.start();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
