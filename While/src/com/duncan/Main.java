package com.duncan;

public class Main {

    public static void main(String[] args) {
//        int count = 0;
//        while (count != 6){
//            System.out.println("Count value = " + count);
//            count ++;
//        }
//
//        count = 0;
//        while(true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("count value = " + count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//        } while (count !=6);

        int number = 5;
        int finishNumber = 20;
        int numberEven = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)){
                number ++;
                continue;
            }

            System.out.println("even number " + number);
            number++;
            numberEven++;
            if (numberEven >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + numberEven);
    }

    public static boolean isEvenNumber (int numb){
        if ((numb%2) == 0){
            return true;
        } else {
            return false;
        }

    }
}
