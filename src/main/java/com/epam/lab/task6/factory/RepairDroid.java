package com.epam.lab.task6.factory;

import org.apache.log4j.Logger;

public class RepairDroid extends Droid {
    public static final Logger LOG = Logger.getLogger(RepairDroid.class);
    private String battery;
    private String gun;
    private String engine;

    public RepairDroid(String battery, String gun, String engine) {
        LOG.info("Create constructor RepairDroid ");
        this.battery = battery;
        this.gun = gun;
        this.engine = engine;
    }

    @Override
    public String getBattery() {
        LOG.info("Start getBattery()");
        return this.battery;
    }

    @Override
    public String getGun() {
        LOG.info("Start getGun() ");
        return this.gun;
    }

    @Override
    public String getEngine() {
        LOG.info("Start getEngine()");
        return this.engine;
    }
}

