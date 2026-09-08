package com.example.laboratorul1.timere;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


class MyHandler implements EventHandler<ActionEvent>{
    private Runnable act;
    MyHandler(Runnable act){
        this.act = act;
    }

    @Override
    public void handle(ActionEvent ignoreaza){
        act.run();

    }
}
