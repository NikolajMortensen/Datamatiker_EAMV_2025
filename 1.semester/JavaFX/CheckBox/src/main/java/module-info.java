module org.example.checkbox {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.checkbox to javafx.fxml;
    exports org.example.checkbox;
}