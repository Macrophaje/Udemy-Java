package com.company;

import java.util.Scanner;

/**
 * Created by duncan.macleod on 1/3/18.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Input Number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x= 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
