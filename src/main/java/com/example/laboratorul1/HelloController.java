package com.example.laboratorul1;

import com.example.laboratorul1.timere.PauseTimer;

import com.example.laboratorul1.timere.TimerSetAutobuz;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class HelloController {
    @FXML
    private Label  timerLabel;
    @FXML
    private Button startTimerButton;
    @FXML
    private TextField  timerInput;
    @FXML
    private Button start;
    @FXML
    private Button stop;
    @FXML
    private Label speakerName;
    @FXML
    private Label dialogueText;
    @FXML
    private Button continueButton;
    @FXML
    private ImageView backgroundImage;

    public int currentSc = 1;
    private TimerSetAutobuz timerSetAutobuz = new TimerSetAutobuz();

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
            dialogueText.setText("Kira se uită la ceas."); // peste cateva sec apare 20:30
            currentSc = 3; //Aici as mai adauga, Troleibuzul 10 trebuia să apară în câteva minute.


        } else if (currentSc == 3) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena4.png").toExternalForm()));
            dialogueText.setText("Se așează și scoate telefonul. Cu colțul ochiului observă un băiat aflat" + "\n" + "câțiva metri mai încolo ce o privea apăsător. ");
            currentSc = 4;


        } else if (currentSc == 4) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena5.png").toExternalForm()));
            dialogueText.setText("Kira decide să vadă cât timp va continua băiatul să o privească și" + "\n" + "porneste cronometrul la ceas.");
            currentSc = 5;//trebu de adaugat butonul start si stop pentru cronometru.
            //cronometru() trebu sa accesez cronometru() din Cronometru.java si sa il pun in scena 5, dar nu stiu cum sa fac asta.

        } else if (currentSc == 5) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena6.png").toExternalForm()));
            dialogueText.setText("Kira: -E vreo problemă? De ce mă privești așa?");
            currentSc = 6;


        } else if (currentSc == 6) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena7.png").toExternalForm()));
            dialogueText.setText("???: -Când vine troleibuzul 10?");
            currentSc = 7;

        }else if (currentSc == 7) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena8.png").toExternalForm()));
            dialogueText.setText("Kira scoate telefonul.");
            currentSc = 8;
        }    else if (currentSc == 8) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena9.png").toExternalForm()));
            dialogueText.setText("Pe aplicație scrie că vine în aproximativ 1 minut.");
            currentSc = 9;
        }else if (currentSc == 9) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena10.png").toExternalForm()));
            dialogueText.setText("Nu te urca. Strigă convingător necunoscutul. ");
            currentSc = 10 ;
        }else if (currentSc == 10) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/scena11.png").toExternalForm()));
            dialogueText.setText("> Scuze, dar eu mă duc acasă. Spune kira și urcă în trolebuz\r\n" + //
                                "Ușile se închid, Troleibuzul pleacă.\r\n" + //
                                "\r\n");
            currentSc = 11;
        }else if (currentSc == 11) {
            backgroundImage.setImage(new Image(getClass().getResource("/Scene/final3.png").toExternalForm()));
            dialogueText.setText("Offff laboratoarele estea =((");
            currentSc = 10;
        }
    }

    @FXML
    private void onStartTimerAutob() {

        int seconds = Integer.parseInt(timerInput.getText());

        timerSetAutobuz.start(seconds, timerLabel, () -> {
            System.out.println("Timer terminat!");
        });
    }
}

