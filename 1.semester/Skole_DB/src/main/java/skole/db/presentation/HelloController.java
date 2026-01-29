package skole.db.presentation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import skole.db.data.DataLayer;
import skole.db.entities.Student;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
  @FXML
  private ListView studentList;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    DataLayer db = new DataLayer();
    ArrayList<Student> students = db.getAllStudents();

    ObservableList<String> oList = FXCollections.observableArrayList();

 // foreach (Student student in students) { [C#]
    for (Student student : students) {
      String entry = student.getFirstName() + " " +
                     student.getLastName() +
                     " (" + student.getSemesterNo() + ".sem)";

      oList.add(entry);
    }

    studentList.setItems(oList);
  }
}