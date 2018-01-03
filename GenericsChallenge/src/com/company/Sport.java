package com.company;

/**
 * Created by duncan.macleod on 1/2/18.
 */
public abstract class Sport {
    private String name;

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
