package com.epam.lab.task6.prototype;

import org.apache.log4j.Logger;

public class NavigationDroid extends Droid {
    public static final Logger LOG = Logger.getLogger(NavigationDroid.class);

    public NavigationDroid() {
        type = "NavigationDroid";
    }

    public void create() {
        LOG.info("Start create()");
        System.out.println("Create method in NavigationDroid");
    }
}
