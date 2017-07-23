package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class SecondGenerationRepairDroid implements SecondGenerationDroid {
    public static final Logger LOG = Logger.getLogger(SecondGenerationRepairDroid.class);

    public void doActionFaster() {
        LOG.info("Start doActionFaster()");
        System.out.println("Second gen repair droid do better repair");
    }
}
