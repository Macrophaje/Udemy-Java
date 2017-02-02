package com.duncan;

/**
 * Created by duncan.macleod on 5/23/16.
 */
public class EnhancedPLayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPLayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("PLayer knocked out");
            //Reduce player lives
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
