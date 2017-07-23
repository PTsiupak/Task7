package com.epam.lab.task6.prototype;

import org.apache.log4j.Logger;

public class TestPrototypePattern {
    public static final Logger LOG = Logger.getLogger(TestPrototypePattern.class);

    public static void main(String[] args) {
        LOG.info("Start main()");
        DroidCache.createDroid();
        Droid clonedDroid = (Droid) DroidCache.getName("BD1");
        System.out.println("Droid - " + clonedDroid.getType());
        Droid clonedDroid2 = (Droid) DroidCache.getName("RD1");
        System.out.println("Droid - " + clonedDroid2.getType());
        Droid clonedDroid3 = (Droid) DroidCache.getName("ND1");
        System.out.println("Droid - " + clonedDroid3.getType());
    }
}
