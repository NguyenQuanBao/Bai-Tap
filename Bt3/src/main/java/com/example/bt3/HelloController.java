package com.example.bt3;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField soMot;

    @FXML
    TextField soHai;

    @FXML
    protected void xuLyCong() {
        int cong = Integer.parseInt(soMot.getText()) + Integer.parseInt(soHai.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("ket qua " + cong);
        alert.show();
    }
    @FXML
    protected void xuLyTru() {
        int tru = Integer.parseInt(soMot.getText()) - Integer.parseInt(soHai.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("ket qua " + tru);
        alert.show();
    }
    @FXML
    protected void xuLyNhan() {
        int nhan = Integer.parseInt(soMot.getText()) * Integer.parseInt(soHai.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("ket qua " + nhan);
        alert.show();
    }
    @FXML
    protected void xuLyChia() {
        double chia = Double.parseDouble(soMot.getText()) / Double.parseDouble(soHai.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("ket qua " + chia);
        alert.show();
    }

}