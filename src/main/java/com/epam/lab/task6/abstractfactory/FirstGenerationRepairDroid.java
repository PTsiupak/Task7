package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class FirstGenerationRepairDroid implements FirstGenerationDroid {
    public static final Logger LOG = Logger.getLogger(FirstGenerationRepairDroid.class);

    public void doAction() {
        LOG.info("Start doAction()");
        System.out.println("First gen repair droid starts repairing");
    }
}
