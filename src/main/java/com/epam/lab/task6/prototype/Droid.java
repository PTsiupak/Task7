package com.epam.lab.task6.prototype;

import org.apache.log4j.Logger;

public abstract class Droid implements Cloneable {
    public static final Logger LOG = Logger.getLogger(Droid.class);
    private String name;
    protected String type;

    abstract void create();

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
