package com.epam.lab.task6.adapter;

import org.apache.log4j.Logger;

public class FactoryOfDroid implements DroidFactory {
    public static final Logger LOG = Logger.getLogger(FactoryOfDroid.class);
    DroidFactoryAdapter droidFactoryAdapter;

    public void createDroid(String droidType, String droidName) {
        LOG.info("Start createDroid()");
        if (droidType.equals("navigationDroid")) {
            System.out.println("Create navigation droid - " + droidName);
        } else if (droidType.equals("repairDroid") || droidType.equals("battleDroid")) {
            droidFactoryAdapter = new DroidFactoryAdapter(droidType);
            droidFactoryAdapter.createDroid(droidType, droidName);
        } else {
            System.out.println("Wrong type of droid: " + droidType);
        }
    }
}
