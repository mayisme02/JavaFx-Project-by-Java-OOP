package com.example.sharkshabu;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class Vegetable extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Vegetable.fxml"));
        primaryStage.setTitle("Shark Shabu");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}