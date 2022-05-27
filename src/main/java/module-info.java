module com.example.main3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main3 to javafx.fxml;
    exports com.example.main3;
}