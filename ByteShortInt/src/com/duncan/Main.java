package com.duncan;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
	    int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        int challengeInt = 200;

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        byte challengeByte = 6;

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue /2);
        short challengeShort = 20;

        //long has a width of 64
        long myLongValue = 100L;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);

        System.out.println("Answer = " + challengeLong);
    }
}
