package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class FirstGenerationFightDroid implements FirstGenerationDroid {
    public static final Logger LOG = Logger.getLogger(FirstGenerationFightDroid.class);

    public void doAction() {
        LOG.info("Start doAction()");
        System.out.println("First gen fight droid starts fighting");
    }
}
