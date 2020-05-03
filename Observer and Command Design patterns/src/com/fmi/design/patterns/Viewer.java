package com.fmi.design.patterns;

import java.util.Observable;
import java.util.Observer;

public class Viewer implements Observer {

    private String name;
    private int age;

    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println(this.name+ " " + this.age + " is " +(String)o);
    }
}
