package skole.db;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import skole.db.data.DataLayer;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    TestStoredProcedure();

    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("presentation/hello-view.fxml"));
//    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("presentation/AddStudent.fxml"));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  private static void TestStoredProcedure() {
    DataLayer db = new DataLayer();

    int n = db.getNStudentsByLN("Haahr");

    System.out.println("Antal studerende: " + n);
  }

  public static void main(String[] args) {
    launch();
  }
}