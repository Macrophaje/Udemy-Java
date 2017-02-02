package com.duncan;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);

        System.out.println("initla page count = " + printer.getPagesPrinted());
        int pagesPrinter = printer.printPages(4);
        System.out.println("pages printes was " + pagesPrinter + " new total print count for printer = " +
                printer.getPagesPrinted());

        pagesPrinter = printer.printPages(2);
        System.out.println("pages printes was " + pagesPrinter + " new total print count for printer = " +
                printer.getPagesPrinted());
    }
}
