package com.epam.lab.task6.prototype;

import org.apache.log4j.Logger;

public class RepairDroid extends Droid {
    public static final Logger LOG = Logger.getLogger(RepairDroid.class);

    public RepairDroid() {
        type = "RepairDroid";
    }

    public void create() {
        LOG.info("Start create()");
        System.out.println("Create method in RepairDroid");
    }
}
