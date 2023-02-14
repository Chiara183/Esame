package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

//import java.io.IOException;

public class CalcApp extends Application {
    Logger logger = Logger.getLogger(CalcApp.class.getName());
    //@Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            stage.setTitle("Calculator");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch(Exception e){
            logger.log(Level.INFO, e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}