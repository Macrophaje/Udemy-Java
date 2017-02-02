package com.duncan;

class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
        this.speed = 0;
    }

    public String startEngine(){
        return "Car engine started";
    }

    public String acceleratae(){
        return "Car is accelerating";
    }

    public String brake(){
        return "Car is braking";
    }


    public String getName() {
        return name;
    }


    public int getCylinders() {
        return cylinders;
    }

}

class Tesla extends Car{

    public Tesla(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName() + " is starting";
    }

    @Override
    public String acceleratae() {
        return super.getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return super.getName() + " is braking";
    }
}

class Mazda extends Car {

    public Mazda(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName() + " is starting";
    }

    @Override
    public String acceleratae() {
        return super.getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return super.getName() + " is braking";
    }
}

class Jeep extends Car {

    public Jeep(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return super.getName() + " is starting";
    }

    @Override
    public String acceleratae() {
        return super.getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return super.getName() + " is braking";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(4, "Car");
        System.out.println(car.startEngine());
        System.out.println(car.acceleratae());
        System.out.println(car.brake());

        Jeep jeep = new Jeep(8, "Jeep Wrangler");
        System.out.println(jeep.startEngine());
        System.out.println(jeep.acceleratae());
        System.out.println(jeep.brake());

        Tesla tesla =  new Tesla(6, "Tesla S");
        System.out.println(tesla.startEngine());
        System.out.println(tesla.acceleratae());
        System.out.println(tesla.brake());

        Mazda mazda = new Mazda(6, "Mazda Speed 3");
        System.out.println(mazda.startEngine());
        System.out.println(mazda.acceleratae());
        System.out.println(mazda.brake());


    }
}
