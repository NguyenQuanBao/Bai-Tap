package com.example.bt2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField cao;

    @FXML
    TextField nang;


    @FXML
    protected void onHelloButtonClick() {
        double canNang;
        double chieuCao;
        double chiSo = Double.parseDouble(nang.getText()) / (Double.parseDouble(cao.getText()) * Double.parseDouble(cao.getText()));
        String ketQua;

        if (chiSo < 18) {
            ketQua = "Bạn là người gầy!";
        } else if (chiSo <= 24.9) {
            ketQua = "Bạn là người bình thường";
        } else if (chiSo <= 29.9) {
            ketQua = "Bạn bị béo phì độ I";
        } else if (chiSo <= 34.9) {
            ketQua = "Bạn bị béo phì độ II";
        } else{
            ketQua = "Bạn bị béo phì độ III";
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("chi so bmi " + chiSo + " " + ketQua);
        alert.show();
    }
}