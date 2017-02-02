package com.duncan;

/**
 * Created by duncan.macleod on 5/23/16.
 */
public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("PLayer knocked out");
            //Reduce player lives
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
