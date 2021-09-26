package Airplane;

import Vehicle.Vehicle;

public class Airplane extends Vehicle {
    private int wheels;
    private String carcass;
    public final int wings;
    private int windStick;

    //конструктор;
    public Airplane(int wheels, String carcass, int wings) {
        this.wheels = wheels;
        this.carcass = carcass;
        this.wings = wings;
    }
    //конструктор
    public Airplane(int wheels, String carcass, int wings, int windStick) {
        this.wheels = wheels;
        this.carcass = carcass;
        this.wings = wings;
        this.windStick = windStick;
    }
    //методы
    public int getWheels() {
        return wheels;
    }

    public String getCarcass() {
        return carcass;
    }

    public int getWings() {
        return wings;
    }

    public int getWindStick() {
        return windStick;
    }

    @Override
    public String getName() {
        return "Airplanes";
    }

    @Override
    public int getEngine() {
        return 4;
    }

    public String noise() {
        return "It produces a lot of noise. ";
    }
    public void fly() {
        System.out.println("Usually average " + getName() + "'s speed ranges from 500 to 800 km / h");
    }
}
