package com.example.laboratorul1.timere;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class TimerSetAutobuz {

    public void start(int seconds, Label timerLabel, Runnable action) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int timp = seconds;

            @Override
            public void run() {

                int valoareCurenta = timp;

                Platform.runLater(() -> {
                    timerLabel.setText(String.valueOf(valoareCurenta));
                });

                if (timp == 0) {
                    timer.cancel();
                    Platform.runLater(() -> {
                        action.run();
                    });

                    return;
                }

                timp--;
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}