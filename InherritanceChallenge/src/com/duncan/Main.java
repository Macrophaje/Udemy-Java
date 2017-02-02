package com.duncan;

public class Main {

    public static void main(String[] args) {

        HondaCRV myHonda = new HondaCRV(0,0, 4, 5, 4, "V4", 1, 1, "Automatic", 2001);
        System.out.println("Year: " + myHonda.getYear());
        myHonda.accelrate(30);
        myHonda.changeGear(3);
        myHonda.turn(90);
    }
}
