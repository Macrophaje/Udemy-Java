package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class Vehicle {

    private String body;
    private int seats;
    private int speed;
    private int direction;

    public Vehicle(String body, int seats, int speed, int direction) {
        this.body = body;
        this.seats = seats;
        this.speed = speed;
        this.direction = direction;
    }

    public void accelrate(int speed){
        if ((this.speed >= speed) || (speed <= 0)) {
            System.out.println("Invalid");
        } else {
            this.speed = speed;
            System.out.println("New Speed: " + speed);
        }

    }

    public void deccelerate(int speed){
        if ((this.speed <= speed)||(speed < 0)){
            System.out.println("Invalid");
        } else {
            this.speed = speed;
            System.out.println("New Speed: " + speed);

        }
    }

    public void turn(int direction) {
        if (this.direction == direction){
            System.out.println("Same direction");
        } else if ((direction < 0) || (direction > 360)) {
            System.out.println("Invalid direction");
        } else {
            this.direction = direction;
            System.out.println("New Direction: " + direction);

        }

    }

    public String getBody() {
        return body;
    }

    public int getSeats() {
        return seats;
    }


    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
