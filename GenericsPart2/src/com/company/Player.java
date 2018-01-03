package com.company;

/**
 * Created by duncan.macleod on 1/2/18.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
