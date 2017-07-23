package com.epam.lab.task6.factory;

import org.apache.log4j.Logger;

public class BattleDroid extends Droid {
    public static final Logger LOG = Logger.getLogger(BattleDroid.class);
    private String battery;
    private String gun;
    private String engine;

    public BattleDroid(String battery, String gun, String engine) {
        LOG.info("Create BattleDroid constructor");
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
        LOG.info("Start getGun()");
        return this.gun;
    }

    @Override
    public String getEngine() {
        LOG.info("Start getEngine()");
        return this.engine;
    }
}
