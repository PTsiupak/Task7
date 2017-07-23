package com.epam.lab.task6.abstractfactory;

public abstract class DroidFactory {

    public abstract FirstGenerationDroid createFirstGenerationDroid(String firstGenDroidType);

    public abstract SecondGenerationDroid createSecondGenerationDroid(String secondGenDroidType);
}
