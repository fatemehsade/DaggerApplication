package com.example.daggerapplication;

import com.example.daggerapplication.model.Computer;
import com.example.daggerapplication.model.Motor;
import com.example.daggerapplication.model.Radiator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MotorModule {
    String motorName;
    String computerName;
    String radiatorName;
    int voltage;

    public MotorModule(String computerName, String radiatorName, int voltage) {
        this.computerName = computerName;
        this.radiatorName = radiatorName;
        this.voltage = voltage;
    }

    @Provides
    @Singleton
    Motor provideMotor(){
        return new Motor(motorName);
    }

    @Provides
    @Singleton
    Computer provideComputer(){
        return new Computer(voltage,computerName);
    }

    @Provides
    @Singleton
    Radiator provideRadiator(){
        return new Radiator(radiatorName);
    }
}
