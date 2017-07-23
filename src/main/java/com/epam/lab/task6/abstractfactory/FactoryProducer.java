package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class FactoryProducer {
    public static final Logger LOG = Logger.getLogger(FactoryProducer.class);

    public static DroidFactory getFactory(String choice) {
        LOG.info("Start getFactory()");
        if (choice.equals("firstGenerationDroidFactory")) {
            return new FirstGenerationDroidFactory();
        } else if (choice.equals("secondGenerationDroidFactory")) {
            return new SecondGenerationDroidFactory();
        }
        return null;
    }
}
