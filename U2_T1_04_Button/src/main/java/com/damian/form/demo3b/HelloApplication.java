package com.damian.form.demo3b;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label label = new Label("Label 1");
        Button button = new Button("Button Aceptar");
        Button button2 = new Button("Button Cancelar");

        button.setOnAction(e -> {
            label.setText("Aceptado!");
        });

        button2.setOnAction(e -> {

            label.setText("Cancelado!");
        });

        VBox vbox = new VBox(20,label, button, button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
