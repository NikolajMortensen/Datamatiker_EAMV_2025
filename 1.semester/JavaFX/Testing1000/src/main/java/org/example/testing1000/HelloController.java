package org.example.testing1000;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double radius;

    @FXML
    public void increase(ActionEvent e) {
        myCircle.setRadius(myCircle.getRadius() + 1);
    }
    @FXML
    public void decrease(ActionEvent e) {
        myCircle.setRadius(myCircle.getRadius() - 1);
    }


}
