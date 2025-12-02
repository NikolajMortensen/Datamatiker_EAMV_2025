module org.example.controllers {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.controllers to javafx.fxml;
    exports org.example.controllers;
}