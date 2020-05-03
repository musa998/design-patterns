package com.fmi.design.patterns;

import javax.swing.text.View;

public class Main {

    public static void main(String[] args) {

        FitnessInstructor fitnessInstructor = new FitnessInstructor();
        TrainingPerson trainingPerson  = new TrainingPerson();

        GetUpCommand getUpCommand = new GetUpCommand(trainingPerson);
        LayDownCommand layDownCommand = new LayDownCommand(trainingPerson);

        Viewer viewer1 = new Viewer("Gosho", 18);
        Viewer viewer2 = new Viewer("Pesho", 21);
        Viewer viewer3 = new Viewer("Mariika", 21);

        trainingPerson.addObserver(viewer1);
        trainingPerson.addObserver(viewer2);
        trainingPerson.addObserver(viewer3);

        fitnessInstructor.doGetUpCommand(getUpCommand);
        fitnessInstructor.doLayDownCommand(layDownCommand);

    }
}
