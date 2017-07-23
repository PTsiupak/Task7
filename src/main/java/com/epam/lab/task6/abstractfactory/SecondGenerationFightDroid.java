package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class SecondGenerationFightDroid implements SecondGenerationDroid {
    public static final Logger LOG = Logger.getLogger(SecondGenerationFightDroid.class);
    public void doActionFaster() {
        LOG.info("Start doActionFaster()");
        System.out.println("Second gen fight droid fight better");
    }
}
