module com.example.javajava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javajava to javafx.fxml;
    exports com.example.javajava;
}