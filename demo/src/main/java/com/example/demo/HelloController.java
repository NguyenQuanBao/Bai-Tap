package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField field;

    @FXML
    protected void onHelloButtonClick() {
        double vnd = 23000;
        double usd = vnd * Integer.parseInt(field.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("so tien sau khi doi la: " + usd);
        alert.show();
    }
}