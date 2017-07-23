package com.epam.lab.task6.adapter;

import org.apache.log4j.Logger;

public class BattleDroidCreator implements AdvancedDroidFactory {
    public static final Logger LOG = Logger.getLogger(BattleDroidCreator.class);

    public void createBattleDroid(String droidName) {
        LOG.info("Start createBattleDroid()");
        System.out.println("Create battle droid - " + droidName);
    }

    public void createRepairDroid(String droidName) {
    }
}
