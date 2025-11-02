package org.example.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import javax.swing.*;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private CheckBox myCheckBox;

    public void change(ActionEvent event) {
        if (myCheckBox.isSelected()) {
            myLabel.setText("ON");
        } else {
            myLabel.setText("OFF");
        }
    }
}
