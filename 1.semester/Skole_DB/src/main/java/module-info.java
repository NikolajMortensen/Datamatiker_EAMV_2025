module skole.db {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.sql;


  opens skole.db to javafx.fxml;
  exports skole.db;
  exports skole.db.presentation;
  opens skole.db.presentation to javafx.fxml;
}