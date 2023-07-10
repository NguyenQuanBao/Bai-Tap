module com.example.bt3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bt3 to javafx.fxml;
    exports com.example.bt3;
}