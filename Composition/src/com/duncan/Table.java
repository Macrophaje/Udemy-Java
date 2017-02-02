package com.duncan;

/**
 * Created by duncan.macleod on 5/19/16.
 */
public class Table {

    private String wood;
    private String shape;
    private int legs;

    public Table(String wood, String shape, int legs) {
        this.wood = wood;
        this.shape = shape;
        this.legs = legs;
    }

    public String getWood() {
        return wood;
    }

    public String getShape() {
        return shape;
    }

    public int getLegs() {
        return legs;
    }
}
