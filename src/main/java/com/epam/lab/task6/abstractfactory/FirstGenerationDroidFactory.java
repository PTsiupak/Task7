package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class FirstGenerationDroidFactory extends DroidFactory {
    public static final Logger LOG = Logger.getLogger(FirstGenerationDroidFactory.class);

    @Override
    public FirstGenerationDroid createFirstGenerationDroid(String firstGenDroidType) {
        LOG.info("Start createFirstGenerationDroid");
        if (firstGenDroidType == null) {
            return null;
        }
        if (firstGenDroidType.equals("fightDroid")) {
            return new FirstGenerationFightDroid();
        } else if (firstGenDroidType.equals("repairDroid")) {
            return new FirstGenerationRepairDroid();
        } else if (firstGenDroidType.equals("navigationDroid")) {
            return new FirstGenerationNavigationDroid();
        }
        return null;
    }
    @Override
    public SecondGenerationDroid createSecondGenerationDroid(String secondGenDroidType) {
        return null;
    }
}
