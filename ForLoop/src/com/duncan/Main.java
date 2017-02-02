package com.duncan;

public class Main {

    public static void main(String[] args) {
        System.out.println("$10,000 @ 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i=0; i<5; i++){
            System.out.println("loop " + i + " hello!");
        }

        for (int i=2; i<9; i++){
            double interest = calculateInterest(10000, i);
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f", interest));
        }

        System.out.println("************************************");

        for (int i=8; i>1; i--){
            double interest = calculateInterest(10000, i);
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f", interest));
        }

        int count = 0;

        for (int i=10; i<50; i++) {
            if (isPrime(i)){
                count++;
                System.out.println(i + " is a prime number");
                if (count == 10){
                    System.out.println("Exiting...");
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if (n==1){
            return false;
        }

        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
