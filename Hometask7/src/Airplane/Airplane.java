package Airplane;

import Vehicle.ICharacteristics;
import Vehicle.IVehicle;

public class Airplane implements IVehicle, ICharacteristics {
    private int wheels;
    private String carcass;
    public final int wings;
    private int windStick;
    private int engine;

    public Airplane(int wheels, String carcass, int wings, int engine) {
        this.wheels = wheels;
        this.carcass = carcass;
        this.wings = wings;
        this.engine = engine;
    }

    public Airplane(int wheels, String carcass, int wings, int engine, int windStick) {
        this.wheels = wheels;
        this.carcass = carcass;
        this.wings = wings;
        this.engine = engine;
        this.windStick = windStick;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getCarcass() {
        return this.carcass;
    }

    public int getWings() {
        return this.wings;
    }

    public int getWindStick() {
        return this.windStick;
    }

    public int getEngine() {
        return this.engine;
    }


    @Override
    public void noise() {
        System.out.println("It usually produces a lot of noise.");
    }

    @Override
    public void materials() {
        System.out.println("Various materials are used for the manufacture of vehicles");
    }

    @Override
    public void transportation() {
        IVehicle.super.transportation();
    }

    @Override
    public void energy() {
        ICharacteristics.super.energy();
    }

    @Override
    public void fuel() {
        System.out.println("A special type of fuel is required for high-quality engine operation");
    }

    @Override
    public void speed() {
        System.out.println("Average speed usually ranges from 500 to 800 km / h");
    }
}