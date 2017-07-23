package com.epam.lab.task6.adapter;

import org.apache.log4j.Logger;

public class TestAdapterPattern {
    public static final Logger LOG = Logger.getLogger(TestAdapterPattern.class);

    public static void main(String[] args) {
        LOG.info("Start main()");
        FactoryOfDroid factoryOfDroid = new FactoryOfDroid();
        factoryOfDroid.createDroid("battleDroid", "BD1");
        factoryOfDroid.createDroid("repairDroid", "RD1");
        factoryOfDroid.createDroid("navigationDroid", "ND1");
        factoryOfDroid.createDroid("battleDroid", "BD2");
    }
}
