package com.epam.lab.task6.factory;

import org.apache.log4j.Logger;

public class TestFactoryPattern {
    public static final Logger LOG = Logger.getLogger(TestFactoryPattern.class);

    public static void main(String[] args) {
        LOG.info("Start main()");
        Droid repairDroid = DroidFactory.getDroid("repairDroid", "2 A", "compact blaster", "3 kW");
        Droid battleDroid = DroidFactory.getDroid("battleDroid", "30 A", "rifle blaster", "50 kW");
        System.out.println("Repair droid = " + repairDroid);
        System.out.println("Battle droid = " + battleDroid);
    }
}
