package com.duncan;

public class Main {

    public static void main(String[] args) {
/*        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();*/

        int legs = 0;
        Chair chair = new Chair("Oak", legs);
        Table table = new Table("Mahagony", "Round", 4);
        Door door = new Door(10, 3, true);

        Room myRoom = new Room(4, door, chair, table);
        myRoom.getChair().checkChair();
        myRoom.useLock();

    }
}
