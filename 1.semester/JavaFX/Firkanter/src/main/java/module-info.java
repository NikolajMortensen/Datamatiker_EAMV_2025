module org.example.firkanter {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.firkanter to javafx.fxml;
    exports org.example.firkanter;
}