package com.example.daggerapplication.model;

import javax.inject.Inject;

public class Motor {

    @Inject
    Computer computer;

    @Inject
    Radiator radiator;

    private String name;

    public Motor(String name) {
        this.name = name;
    }

    public boolean startEngine()
    {
        if (computer!=null &&radiator!=null)
        {
            return true;
        }
        return false;
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public String getName() {
        return name;
    }
}
