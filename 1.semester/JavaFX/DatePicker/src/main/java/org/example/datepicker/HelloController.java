package org.example.datepicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class HelloController {
    @FXML
    private Label myLabel;
    @FXML
    private DatePicker myDatePicker;

    public void getDate(ActionEvent event) {
        LocalDate myDate = myDatePicker.getValue();
        myLabel.setText(myDate.toString());
    }
}
