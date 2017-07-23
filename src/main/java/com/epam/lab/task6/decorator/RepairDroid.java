package com.epam.lab.task6.decorator;

import org.apache.log4j.Logger;

public class RepairDroid extends DroidDecorator {
    public static final Logger LOG = Logger.getLogger(RepairDroid.class);

    public RepairDroid(Droid d) {
        super(d);
    }
    @Override
    public void assemble() {
        LOG.info("Start assemble()");
        super.assemble();
        System.out.println("Repair droid has ability to repair");
    }
}
