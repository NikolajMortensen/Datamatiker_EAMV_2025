module org.example.imageviewfinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.imageviewfinal to javafx.fxml;
    exports org.example.imageviewfinal;
}