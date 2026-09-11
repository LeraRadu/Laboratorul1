package com.example.laboratorul1.timere;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class TransitionTImer {

	private Timer timer;
	private TimerTask timerTask;

	public void start(int duration, Label label, Runnable action) {
		stop();

		timer = new Timer(true);
		timerTask = new TimerTask() {
			private int seconds = duration;

			@Override
			public void run() {
				int remaining = seconds--;
				Platform.runLater(() -> label.setText(String.valueOf(remaining)));

				if (remaining <= 0) {
					stop();
					Platform.runLater(action);
				}
			}
		};

		timer.scheduleAtFixedRate(timerTask, 0, 1000);
	}

	public void stop() {
		if (timerTask != null) {
			timerTask.cancel();
			timerTask = null;
		}
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
	}
}

