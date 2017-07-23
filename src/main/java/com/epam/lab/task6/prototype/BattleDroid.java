package com.epam.lab.task6.prototype;

import org.apache.log4j.Logger;

public class BattleDroid extends Droid {
    public static final Logger LOG = Logger.getLogger(BattleDroid.class);

    public BattleDroid()  {
        type = "BattleDroid";
    }

    public void create() {
        LOG.info("Start create()");
        System.out.println("Create method in BattleDroid");
    }
}
