package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class SecondGenerationDroidFactory extends DroidFactory {
    public static final Logger LOG = Logger.getLogger(SecondGenerationDroidFactory.class);

    @Override
    public FirstGenerationDroid createFirstGenerationDroid(String firstGenDroidType) {
        return null;
    }

    @Override
    public SecondGenerationDroid createSecondGenerationDroid(String secondGenDroidType) {
        LOG.info("Start createSecondGenerationDroid()");
        if (secondGenDroidType == null) {
            return null;
        }
        if (secondGenDroidType.equals("fightDroid")) {
            return new SecondGenerationFightDroid();
        } else if (secondGenDroidType.equals("repairDroid")) {
            return new SecondGenerationRepairDroid();
        } else if (secondGenDroidType.equals("navigationDroid")) {
            return new SecondGenerationNavigationDroid();
        }
        return null;
    }
}
