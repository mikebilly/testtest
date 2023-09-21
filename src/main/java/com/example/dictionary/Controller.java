package com.example.dictionary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    private TextField wordTranslate;
    @FXML
    private Button translateBTN;

    @FXML
    public void clickTranslate(ActionEvent event){
        String curWord = wordTranslate.getText();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("The word you want to look up: " + curWord);
        alert.show();
    }
}
