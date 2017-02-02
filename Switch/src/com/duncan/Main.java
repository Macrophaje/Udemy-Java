package com.duncan;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }
//        if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("Value not 1 or 2");
//        }

//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:case 4:case 5:
//                System.out.println("Was a 3, 4, or 5");
//                System.out.println("Was a " + switchValue);
//                break;
//            default:
//                System.out.println("Value was not 1 or 2");
//                break;
//        }

        char letterSwitch = 'F';

        switch (letterSwitch) {
            case 'A':
                System.out.println("The letter is A");
                break;

            case 'B':
                System.out.println("The letter is B");
                break;

            case 'C':
                System.out.println("The letter is C");
                break;

            case 'D':
                System.out.println("The letter is D");
                break;

            case 'E':
                System.out.println("The letter is E");
                break;

            default:
                System.out.println("Not A, B, C, D or E");

        }

        String month = "JUNE";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not Sure");
        }


    }
}
