package com.epam.lab.task6.abstractfactory;

import org.apache.log4j.Logger;

public class TestAbstractFactory {
    public static final Logger LOG = Logger.getLogger(TestAbstractFactory.class);

    public static void main(String[] args) {
        LOG.info("Start main()");
        DroidFactory firstGenDroidFactory = FactoryProducer.getFactory("firstGenerationDroidFactory");
        FirstGenerationDroid firstGenerationDroid1 = firstGenDroidFactory.createFirstGenerationDroid("fightDroid");
        firstGenerationDroid1.doAction();
        FirstGenerationDroid firstGenerationDroid2 = firstGenDroidFactory.createFirstGenerationDroid("repairDroid");
        firstGenerationDroid2.doAction();
        FirstGenerationDroid firstGenerationDroid3 = firstGenDroidFactory.createFirstGenerationDroid("navigationDroid");
        firstGenerationDroid3.doAction();

        DroidFactory secondGenDroidFactory = FactoryProducer.getFactory("secondGenerationDroidFactory");
        SecondGenerationDroid secondGenerationDroid1 = secondGenDroidFactory.createSecondGenerationDroid("fightDroid");
        secondGenerationDroid1.doActionFaster();
        SecondGenerationDroid secondGenerationDroid2 = secondGenDroidFactory.createSecondGenerationDroid("repairDroid");
        secondGenerationDroid2.doActionFaster();
        SecondGenerationDroid secondGenerationDroid3 = secondGenDroidFactory.createSecondGenerationDroid("navigationDroid");
        secondGenerationDroid3.doActionFaster();
    }
}
