package com.duncan;

/**
 * Created by duncan.macleod on 5/19/16.
 */
public class Room {

    private int walls;
    private Door frontDoor;
    private Chair chair;
    private Table table;

    public Room(int walls, Door frontDoor, Chair chair, Table table) {
        this.walls = walls;
        this.frontDoor = frontDoor;
        this.chair = chair;
        this.table = table;
    }

    public void useLock(){
        frontDoor.doorLock();
        boolean lockStatus = frontDoor.isLocked();
        if (lockStatus == true){
            System.out.println("The door is locked");
        } else {
            System.out.println("The door is unlocked");
        }
    }

    public int getWalls() {
        return walls;
    }

    public Door getFrontDoor() {
        return frontDoor;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }
}
