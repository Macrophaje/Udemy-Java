package com.company;

/**
 * Created by duncan.macleod on 1/3/18.
 */
public class SIBTest {
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTest static initializion block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }

}

