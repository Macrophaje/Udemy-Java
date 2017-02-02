package com.duncan;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char reg = '\u00AE';
        System.out.println("The registered symbol is " + reg);

    }
}
