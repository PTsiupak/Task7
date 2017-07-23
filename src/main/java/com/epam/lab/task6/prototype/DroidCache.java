package com.epam.lab.task6.prototype;

import org.apache.log4j.Logger;

import java.util.Hashtable;
import java.util.Map;

public class DroidCache {
    public static final Logger LOG = Logger.getLogger(DroidCache.class);

    private static Map<String, Droid> droidMap = new Hashtable<>();

    public static Droid getName(String droidName) {
        LOG.info("Start getName()");
        Droid cachedDroid = droidMap.get(droidName);
        return (Droid)cachedDroid.clone();
    }

    public static void createDroid() {
        LOG.info("Start createDroid()");
        BattleDroid battleDroid = new BattleDroid();
        battleDroid.setName("BD1");
        droidMap.put(battleDroid.getName(), battleDroid);
        RepairDroid repairDroid = new RepairDroid();
        repairDroid.setName("RD1");
        droidMap.put(repairDroid.getName(), repairDroid);
        NavigationDroid navigationDroid = new NavigationDroid();
        navigationDroid.setName("ND1");
        droidMap.put(navigationDroid.getName(), navigationDroid);
    }
}
