package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(int size, int weight, String name, int fins,
                int eyes, int gills) {
        super(1, 1, size, weight, name);
        this.fins = fins;
        this.eyes = eyes;
        this.gills = gills;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackfin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackfin();
        super.move(speed);
    }
}
