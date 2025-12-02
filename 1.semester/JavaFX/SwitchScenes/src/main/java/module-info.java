module org.example.switchscenes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.switchscenes to javafx.fxml;
    exports org.example.switchscenes;
}