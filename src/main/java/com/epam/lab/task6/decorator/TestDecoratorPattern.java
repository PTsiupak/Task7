package com.epam.lab.task6.decorator;

import org.apache.log4j.Logger;

public class TestDecoratorPattern {
    public static final Logger LOG = Logger.getLogger(TestDecoratorPattern.class);

    public static void main(String[] args) {
        LOG.info("Start main()");
        Droid fightDroid = new FightDroid(new BasicDroid());
        fightDroid.assemble();
        System.out.println("\n");
        Droid repairDroid = new RepairDroid(new BasicDroid());
        repairDroid.assemble();
    }
}
