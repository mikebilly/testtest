package com.example.dictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationDic extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ApplicationDic.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 768, 480);
        stage.setTitle("Dictionary En-Vi");
        stage.setScene(scene);
        stage.show();
    }
}
