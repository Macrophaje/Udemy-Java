package com.duncan;

/**
 * Created by duncan.macleod on 5/19/16.
 */
public class Chair {

    private String wood;
    private int legs;

    public Chair(String wood, int legs) {
        this.wood = wood;
        this.legs = legs;
    }

    public void checkChair (){
        int legs = this.legs;
        if (legs <= 2){
            System.out.println("This chair wont stand up, it has only " + legs + " legs");
        } else if (legs == 3){
            System.out.println("This chair is a stool");
        } else if (legs == 4){
            System.out.println("This is a normal chair");
        } else {
            System.out.println("A chair with " + legs + " legs is a crazy chair");
        }
    }


}
