package com.example.laboratorul1;

import com.example.laboratorul1.timere.PauseTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class HelloController {
    @FXML
    private Label speakerName;
    @FXML
    private Label dialogueText;
    @FXML
    private Button continueButton;
    @FXML
    private ImageView backgroundImage;

    public int currentSc = 1;

    @FXML
    private void onNextClick() {
        PauseTimer p = new PauseTimer();
        if (currentSc == 1) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena2.png").toExternalForm()));//url to string
            dialogueText.setText("Kira merge spre stație prin liniștea întunecată.");
            p.start(2, () -> {
                dialogueText.setText("În scurt timp, ajunse la stație.");
            });
            currentSc = 2;

        } else if (currentSc == 2) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena3.png").toExternalForm()));
            dialogueText.setText("Kira se așază pe bancă.Se uită la ceas."); // peste cateva sec apare 20:30
            currentSc = 3;

        } else if (currentSc == 3) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena4.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 4;
        } else if (currentSc == 4) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena5.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 5;
        } else if (currentSc == 5) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena6.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 6;
        } else if (currentSc == 6) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena7.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 7;

        }else if (currentSc == 7) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena8.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 8;
        }    else if (currentSc == 8) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena9.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 9;
        }else if (currentSc == 9) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena10.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 10 ;
        }else if (currentSc == 10) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena11.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 11;
        }else if (currentSc == 11) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/final3.png").toExternalForm()));
            dialogueText.setText("");
            currentSc = 10;
        }
    }
}

