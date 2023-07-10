module com.example.bt2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.bt2 to javafx.fxml;
    exports com.example.bt2;
}