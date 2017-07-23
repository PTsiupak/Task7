package com.epam.lab.task6.factory;

import org.apache.log4j.Logger;

public class DroidFactory {
    public static final Logger LOG = Logger.getLogger(DroidFactory.class);

    public static Droid getDroid(String type, String battery, String gun, String engine) {
        LOG.info("Start getDroid()");
        if("battleDroid".equals(type)) {
            return new BattleDroid(battery, gun, engine);
        } else if ("repairDroid".equals(type))  {
            return new RepairDroid(battery, gun, engine);
        } else {
            return null;
        }
    }
}
