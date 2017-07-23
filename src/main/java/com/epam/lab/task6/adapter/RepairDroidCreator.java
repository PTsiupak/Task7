package com.epam.lab.task6.adapter;

import org.apache.log4j.Logger;

public class RepairDroidCreator implements AdvancedDroidFactory {
    public static final Logger LOG = Logger.getLogger(RepairDroidCreator.class);

    public void createBattleDroid(String droidName) {
    }

    public void createRepairDroid(String droidName) {
        LOG.info("Start createRepairDroid()");
        System.out.println("Create repair droid - " + droidName);
    }
}
