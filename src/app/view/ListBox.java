package app.view;

import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class ListBox
{
	public static void display(List<String> listOfStrings){

		FXMLLoader loader = new FXMLLoader();
		Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); // Blocks interaction with parent windows
        window.setMinWidth(1000);
        window.setMinHeight(916);

		loader = new FXMLLoader(ListBox.class.getResource("ListBox.fxml"));
		Parent layout = null;
		try {
			layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ListBoxController listBoxController = (ListBoxController) loader.getController();

		JFXListView list = listBoxController.getList();
		ObservableList<String> setList = FXCollections.observableArrayList(listOfStrings);
		list.setItems(setList);

		Scene scene = new Scene(layout, 1000, 916);
		window.setScene(scene);
		window.showAndWait();
	}
}
