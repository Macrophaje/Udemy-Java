package com.duncan;

/**
 * Created by duncan.macleod on 5/23/16.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = isDuplex;
    }

    public int fillToner(int newToner) {
        if (newToner > 0 && newToner <= 100) {
            if (this.tonerLevel + newToner > 100) {
                return -1;
            } else {
                this.tonerLevel += newToner;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in Duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }
}
