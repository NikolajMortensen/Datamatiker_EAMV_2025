package org.example.progressbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;

    @FXML
    private ProgressBar myProgressBar;

    @FXML
    private Button myButton;

    BigDecimal progress = new BigDecimal(String.format("%,2f", 0.0));


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myProgressBar.setStyle("-fx-accent: #00FF00");
    }

    public void increaseProgress() {

        if (progress.doubleValue() < 1) {
            progress = new BigDecimal(String.format("%,2f", progress.doubleValue() + 0.1));
            myProgressBar.setProgress(progress.doubleValue());
            myLabel.setText(Integer.toString((int)Math.round(progress.doubleValue() * 100)) + "%");
        }
    }
}
