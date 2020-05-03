package com.fmi.design.patterns;
import java.util.Observable;

public class TrainingPerson extends Observable {

    private String getUp;
    private String layDown;

    public void setGetUp(String value){
        this.getUp = value;
        setChanged();
        notifyObservers(value);
    }

    public void setLayDown(String value){
        this.layDown = value;
        setChanged();
        notifyObservers(value);
    }
}
