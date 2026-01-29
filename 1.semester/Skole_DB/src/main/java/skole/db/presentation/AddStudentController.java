package skole.db.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import skole.db.data.DataLayer;
import skole.db.entities.Student;

public class AddStudentController {
  @FXML
  private TextField firstNameTextField, lastNameTextField, semesterNoTextField;

  @FXML
  public void onOkayButtonPressed() {
    System.out.println("Okay pressed!");

    // indlæser studerende
    String firstName = firstNameTextField.getText();
    String lastName = lastNameTextField.getText();
    int semesterNo = Integer.parseInt(semesterNoTextField.getText());

    Student student = new Student(lastName, firstName, semesterNo);

    // opretter studerende
    DataLayer db = new DataLayer();

    db.insertStudent(student);
  }

  @FXML
  public void onCancelButtonPressed() {
    System.out.println("Cancel pressed!");
  }
}
