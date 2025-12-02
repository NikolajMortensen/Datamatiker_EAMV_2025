package org.example.firkanter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    Rectangle firstRec = new Rectangle();

    @FXML
    Rectangle secondRec = new Rectangle();

    private void moveLeft(Rectangle rect) {
        double oldX = rect.getX();
        rect.setX(rect.getX() - 10);

        if (checkCollision()) {
            rect.setX(oldX);
        }

    }

    private void moveRight(Rectangle rect) {
        double oldX = rect.getX();
        rect.setX(rect.getX() + 10);

        if (checkCollision()) {
            rect.setX(oldX);
        }
    }

    @FXML
    public void moveFirstLeft(ActionEvent e) {
        moveLeft(firstRec);
    }

    @FXML
    public void moveFirstRight(ActionEvent e) {
        moveRight(firstRec);
    }

    @FXML
    public void moveSecondLeft(ActionEvent e) {
        moveLeft(secondRec);
    }

    @FXML
    public void moveSecondRight(ActionEvent e) {
        moveRight(secondRec);
    }

    // Ny metode til at tjekke collision mellem de to rectangler
    private boolean checkCollision() {
        return firstRec.getBoundsInParent().intersects(
                secondRec.getBoundsInParent());
    }


}
