package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {

    public JFXComboBox comboBox;
    public AnchorPane root;

    public void selectOnAction(ActionEvent actionEvent) {
        ComboBox<String> box = new ComboBox<>();
        box.getItems().add("In Parking");
        box.getItems().add("In Delivery");
        HBox root = new HBox(box);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/views/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setTitle("Add Vehicle");
        stage.setScene(scene);
        stage.show();
    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/views/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Add Driver");
        stage.show();
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = this.getClass().getResource("/views/MainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
