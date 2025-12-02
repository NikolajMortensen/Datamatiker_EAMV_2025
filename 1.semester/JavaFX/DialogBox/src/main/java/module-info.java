module org.example.sum {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.sum to javafx.fxml;
    exports org.example.sum;
}