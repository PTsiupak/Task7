package com.epam.lab.task6.decorator;

import org.apache.log4j.Logger;

public class FightDroid extends DroidDecorator {
    public static final Logger LOG = Logger.getLogger(FightDroid.class);

    public FightDroid(Droid d) {
        super(d);
    }

    @Override
    public void assemble() {
        LOG.info("Start assemble()");
        super.assemble();
        System.out.println("Fight droid has ability to fight.");
    }
}
