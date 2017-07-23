package com.epam.lab.task6.decorator;

import org.apache.log4j.Logger;

public class BasicDroid implements Droid {
    public static final Logger LOG = Logger.getLogger(BasicDroid.class);

    public void assemble() {
        LOG.info("Start assemble()");
        System.out.println("Create Basic DroidFactory platform");
    }
}
