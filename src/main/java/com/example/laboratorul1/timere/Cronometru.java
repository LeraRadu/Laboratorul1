package com.example.laboratorul1.timere;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Cronometru {
    private int secunde;
    private final Label timerLabel;
    private final Timeline stopwatch;

    public Cronometru(Label timerLabel) {
        this.timerLabel = timerLabel;
        stopwatch = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            secunde++;
            this.timerLabel.setText(secunde + " sec");
        }));
        stopwatch.setCycleCount(Timeline.INDEFINITE);
    }

    public void start() {
        stopwatch.play();
    }

    public void stop() {
        stopwatch.stop();
    }
}
