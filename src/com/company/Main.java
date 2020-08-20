package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println("*************************");

        Lambo lambo = new Lambo();
        lambo.startEngine();
        lambo.accelerate();
        lambo.brake();
    }

}

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name){
        this.cylinders=cylinders;
        this.name= name;
        this.engine= true;
        this.wheels=4;
    }

    public boolean getEngine(){
        return this.engine;
    }

    public int getCylinders(){
        return this.cylinders;
    }

    public int getWheels(){
        return this.wheels;
    }

    public String getName(){
        return this.name;
    }

    public void startEngine(){
        System.out.println("Engine is starting");
    }

    public void accelerate(){
        System.out.println("Accelerating Car");
    }

    public void brake(){
        System.out.println("Brake is being applied");
    }
}

class Lambo extends Car {
    public Lambo(){
        super(4,"Lamborghini");
    }

    @Override
    public void startEngine(){
        System.out.println(getClass().getSimpleName() + "Engine Starting"); //prints Lambo Engine Starting
    }
}

class Ferrari extends Car {
    public Ferrari(){
        super(4,"Ferrari");
    }

    @Override
    public void accelerate(){
        System.out.println("Ferrari going zoom zoom");
    }
}

class Nissan extends Car {
    public Nissan(){
        super(2,"Bad Car");
    }

    @Override
    public void brake() {
        System.out.println("BRAKE BEING PUSHEDDDD!!!!!!!!");
    }
}



