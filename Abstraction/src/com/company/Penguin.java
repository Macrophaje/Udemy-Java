package com.company;

/**
 * Created by duncan.macleod on 5/16/17.
 */
public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Can't do that");
    }
}
