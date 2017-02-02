package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class HondaCRV extends Car {

    private int spareTire;
    private String locks;
    private int year;

    public HondaCRV(int speed, int direction, int doors, int gears, int wheels,
                    String engine, int currentGear, int spareTire, String locks, int year) {
        super("CRV", 4, speed, direction, doors, gears, wheels, engine, currentGear);
        this.spareTire = spareTire;
        this.locks = locks;
        this.year = year;
    }

    public int getSpareTire() {
        return spareTire;
    }

    public void setSpareTire(int spareTire) {
        this.spareTire = spareTire;
    }

    public String getLocks() {
        return locks;
    }

    public void setLocks(String locks) {
        this.locks = locks;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
