package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class FirstGenerationNavigationDroid implements FirstGenerationDroid {
    public static final Logger LOG = Logger.getLogger(FirstGenerationNavigationDroid.class);

    public void doAction() {
        LOG.info("Start doAction()");
        System.out.println("First gen navigation droid starts navigation");
    }
}
