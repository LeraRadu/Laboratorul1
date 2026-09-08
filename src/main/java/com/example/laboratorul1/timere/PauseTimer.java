    package com.example.laboratorul1.timere;
    import javafx.animation.PauseTransition;
    import javafx.event.ActionEvent;
    import javafx.event.EventHandler;
    import javafx.util.Duration;
    import javafx.animation.Animation;

    public class PauseTimer {
     public void start(double sec, Runnable act){ //Secunde cate asteapta si actiunea care trebuie sa fie indeplinita pentru ca in interfata Runnable avem metoda run() care deodata va porni actiunea , care va fi upa pauza
         PauseTransition pause =  new PauseTransition(Duration.seconds(sec));
         MyHandler handler = new MyHandler(act);
         pause.setOnFinished(handler);
         pause.play();





     }
    }
