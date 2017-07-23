package com.epam.lab.task6.adapter;

import org.apache.log4j.Logger;

public class DroidFactoryAdapter implements DroidFactory {
    public static final Logger LOG = Logger.getLogger(DroidFactoryAdapter.class);
    AdvancedDroidFactory advancedDroidFactory;

    public DroidFactoryAdapter(String droidType) {
        LOG.info("Create constructor DroidFactoryAdapter");
        if (droidType.equals("battleDroid")) {
            advancedDroidFactory = new BattleDroidCreator();
        } else if (droidType.equals("repairDroid")) {
            advancedDroidFactory = new RepairDroidCreator();
        }
    }

    public void createDroid(String droidType, String droidName) {
        LOG.info("Start createDroid()");
        if (droidType.equals("battleDroid")) {
            advancedDroidFactory.createBattleDroid(droidName);
        } else if (droidType.equals("repairDroid")) {
            advancedDroidFactory.createRepairDroid(droidName);
        }
    }
}
