package com.duncan;

/**
 * Created by duncan.macleod on 5/5/16.
 */
public class Animal {

    private int brian;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brian, int body, int size, int weight, String name) {
        this.brian = brian;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal.eat() called");

    }

    public void move(int speed){
        System.out.println("Animal.move called. Animal is moving at " + speed);

    }

    public int getBrian() {
        return brian;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
