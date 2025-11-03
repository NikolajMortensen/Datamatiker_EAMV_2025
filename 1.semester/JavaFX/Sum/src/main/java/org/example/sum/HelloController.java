package org.example.sum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private TextField myTextField1, myTextField2;
    @FXML
    private Button myButton;

    private int sum;

    public void calcSum(ActionEvent event) {
        try {
            int firstNum = Integer.parseInt(myTextField1.getText());
            int secondNum = Integer.parseInt(myTextField2.getText());
            sum = firstNum + secondNum;
            myLabel.setText("Summen er: " + sum);
        } catch (NumberFormatException e) {
            myLabel.setText("Indtast gyldigt tal!");
        }

    }
}
