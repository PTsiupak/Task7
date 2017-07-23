package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class SecondGenerationNavigationDroid implements SecondGenerationDroid {
    public static final Logger LOG = Logger.getLogger(SecondGenerationNavigationDroid.class);
    public void doActionFaster() {
        LOG.info("Start doActionFaster()");
        System.out.println("Second gen navigation droid navigate better");
    }
}
