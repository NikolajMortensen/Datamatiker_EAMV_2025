module org.example.midtvejseksamen {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.midtvejseksamen to javafx.fxml;
    exports org.example.midtvejseksamen;
}