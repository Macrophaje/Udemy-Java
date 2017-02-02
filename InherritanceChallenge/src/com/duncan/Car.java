package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class Car extends Vehicle {

    private int doors;
    private int gears;
    private int wheels;
    private String engine;
    private int currentGear;

    public Car (String body, int seats, int speed, int direction, int doors, int gears, int wheels,
               String engine, int currentGear) {
        super(body, seats, speed, direction);
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.engine = engine;
        this.currentGear = currentGear;
    }

    public void changeGear(int gear){
        if (gear > gears){
            System.out.println("invalid gear");
        } else {
            this.currentGear = gear;
            System.out.println("Current Gear: " + gear);
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
