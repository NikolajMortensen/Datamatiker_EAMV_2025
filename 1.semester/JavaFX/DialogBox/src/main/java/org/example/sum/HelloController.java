package org.example.sum;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private void onDialogBoxPressed() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Her er title");
        alert.setHeaderText("Her er header");
        alert.setContentText("Her er spørgsmålet");

        if (alert.showAndWait().get() == ButtonType.OK)
            System.out.println("Okay pressed");
        else
            System.out.println("Cancel pressed");

        alert.showAndWait();
    }
}
