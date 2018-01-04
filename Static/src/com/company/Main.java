package com.company;

public class Main {
    public static int multiplier = 7;

    public static void main(String[] args) {
	// write your code here
//        System.out.println(StaticTest.getNumInstances());
//
//        StaticTest firstInstance = new StaticTest("First Instance");
//        System.out.println(firstInstance.getName() + ": " + StaticTest.getNumInstances());
//
//        StaticTest secondINstance = new StaticTest("Second Instance");
//        System.out.println(secondINstance.getName() + ": " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("Third Instance");
//        System.out.println(thirdInstance.getName() + ": " + StaticTest.getNumInstances());
//
        //java com.company.Main

        int answer = multiply(6);
        System.out.println("Answer: " + answer);
        System.out.println("Multiplier: " + multiplier);
    }
    public static int multiply (int number) {
        return number * multiplier;
    }
}
