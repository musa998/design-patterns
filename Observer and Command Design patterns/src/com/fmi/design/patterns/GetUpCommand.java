package com.fmi.design.patterns;

public class GetUpCommand implements Excercise {

    TrainingPerson trainee = new TrainingPerson();

    public GetUpCommand(TrainingPerson trainee) {
        this.trainee = trainee;
    }

    @Override
    public void doExcercise() {
        trainee.setGetUp("Getting up");
    }
}
