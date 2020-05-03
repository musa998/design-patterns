package com.fmi.design.patterns;

public class FitnessInstructor  {
    GetUpCommand getUpCommand;
    LayDownCommand layDownCommand;


    public void doGetUpCommand(GetUpCommand getUpCommand) {
        this.getUpCommand = getUpCommand;
        this.getUpCommand.doExcercise();
    }

    public void doLayDownCommand(LayDownCommand layDownCommand) {
        this.layDownCommand = layDownCommand;
        this.layDownCommand.doExcercise();
    }
}
