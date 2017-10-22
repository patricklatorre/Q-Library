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
	public static void display(List<String> listOfStrings, List<String> header){

		FXMLLoader loader = new FXMLLoader();
		Stage window = new Stage();
       // window.initModality(Modality.APPLICATION_MODAL); // Blocks interaction with parent windows
        window.setMinWidth(1200);
        window.setMinHeight(850);

		loader = new FXMLLoader(ListBox.class.getResource("ListBox.fxml"));
		Parent layout = null;
		try {
			layout = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ListBoxController listBoxController = loader.getController();

		String listHeaderText = "";
		for (int i = 0; i < header.size(); i++) {
			if( i > 0 )
				listHeaderText += " - ";
			listHeaderText += header.get(i);
		}

		listBoxController.getHeader().setText(listHeaderText);

		JFXListView list = listBoxController.getList();
		ObservableList<String> setList = FXCollections.observableArrayList(listOfStrings);
		list.setItems(setList);

		Scene scene = new Scene(layout, 1000, 916);
		window.setScene(scene);
		window.showAndWait();
	}
}
