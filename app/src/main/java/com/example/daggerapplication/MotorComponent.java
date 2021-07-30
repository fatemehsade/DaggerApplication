package com.example.daggerapplication;

import com.example.daggerapplication.model.Motor;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {MotorModule.class})
public interface MotorComponent {
    void inject(MainActivity mainActivity);
    void inject(Motor motor);
}
