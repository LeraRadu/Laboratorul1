package com.example.laboratorul1.timere;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Cronometru {

    private int secunde = 0;
    private final Label label;
    private final Timeline timeline;

    public Cronometru(Label label) {
        this.label = label;

        timeline = new Timeline(
            new KeyFrame(Duration.seconds(1), event -> {
                secunde++;
                label.setText(String.valueOf(secunde));
            })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    public void start() {
        timeline.play();
    }

    public void stop() {
        timeline.stop();
    }

    public int getSecunde() {
        return secunde;
    }
}