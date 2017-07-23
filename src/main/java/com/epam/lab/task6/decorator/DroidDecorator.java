package com.epam.lab.task6.decorator;

public class DroidDecorator implements Droid {
    protected Droid droid;

    public DroidDecorator(Droid d) {
        this.droid = d;
    }

    public void assemble() {
        this.droid.assemble();
    }
}
