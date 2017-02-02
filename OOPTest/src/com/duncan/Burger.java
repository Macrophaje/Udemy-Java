package com.duncan;

/**
 * Created by duncan.macleod on 5/24/16.
 */
public class Burger {

    private String breadRoll;
    private String meatType;
    private boolean lettuce;
    private boolean tomato;
    private boolean cheese;
    private boolean bacon;
    private double basePrice;
    private double finalPrice;

    public Burger(String breadRoll, String meatType, double price) {
        this.breadRoll = breadRoll;
        this.meatType = meatType;
        this.basePrice = price;
        this.lettuce = false;
        this.tomato = false;
        this.cheese = false;
        this.bacon = false;
        this.finalPrice = this.basePrice;
    }

    public void addLettuce (){
        if (this.lettuce){
            System.out.println("Lettuce alreaedy added.");
        } else {
            this.lettuce = true;
            this.finalPrice += .50;
            System.out.println("Lettuce added");
        }
    }

    public void addTomato (){
        if (this.tomato){
            System.out.println("Tomato alreaedy added.");
        } else {
            this.tomato = true;
            this.finalPrice += .50;
            System.out.println("Tomato added");
        }
    }

    public void addCheese (){
        if (this.cheese){
            System.out.println("Cheese alreaedy added.");
        } else {
            this.cheese = true;
            this.finalPrice += .50;
            System.out.println("Cheese added");
        }
    }

    public void addBacon (){
        if (this.bacon){
            System.out.println("Bacon alreaedy added.");
        } else {
            this.bacon = true;
            this.finalPrice += .50;
            System.out.println("Bacon added");
        }
    }

    public void reviewOrder (){
        System.out.println(this.meatType + " burger on " + breadRoll + "\n");
        if (lettuce){

        }

    }
}
