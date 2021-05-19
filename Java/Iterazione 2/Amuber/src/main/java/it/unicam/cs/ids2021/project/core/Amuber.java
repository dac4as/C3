package it.unicam.cs.ids2021.project.core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;

public class Amuber extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Amuber");
            primaryStage.setScene(new Scene(FXMLLoader.load(new File("src/main/java/it/unicam/cs/ids2021/project/core/amuber.fxml").toURI().toURL())));
            primaryStage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
