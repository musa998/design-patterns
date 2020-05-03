package com.fmi.design.patterns;

public class LayDownCommand implements Excercise {

    TrainingPerson trainingPerson = new TrainingPerson();

    public LayDownCommand(TrainingPerson trainingPerson) {
        this.trainingPerson = trainingPerson;
    }

    @Override
    public void doExcercise() {
        trainingPerson.setLayDown("Laying down");
    }
}
