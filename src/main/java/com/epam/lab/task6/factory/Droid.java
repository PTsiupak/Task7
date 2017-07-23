package com.epam.lab.task6.factory;

import org.apache.log4j.Logger;

public abstract class Droid {
    public static final Logger LOG = Logger.getLogger(Droid.class);

    public abstract String getBattery();
    public abstract String getGun();
    public abstract String getEngine();

    @Override
    public String toString() {
        LOG.info("Override toString()");
        return "Battery = " + this.getBattery() + ", Gun = " + this.getGun() + ", Engine = " + this.getEngine();
    }

}
