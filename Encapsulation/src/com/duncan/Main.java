package com.duncan;

public class Main {

    public static void main(String[] args) {
       /* Player player = new Player();
        player.fullName = "Tim";
        // player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());*/

        EnhancedPLayer player = new EnhancedPLayer("Tim", 200, "sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}