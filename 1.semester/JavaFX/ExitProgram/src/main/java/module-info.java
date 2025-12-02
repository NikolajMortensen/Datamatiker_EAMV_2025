module org.example.exitprogram {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens org.example.exitprogram to javafx.fxml;
    exports org.example.exitprogram;
}