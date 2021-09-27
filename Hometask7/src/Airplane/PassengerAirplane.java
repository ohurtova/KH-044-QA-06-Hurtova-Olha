package Airplane;

public class PassengerAirplane extends Airplane {
    public PassengerAirplane(int wheels, String carcass, int wings, int engine) {
        super(wheels, carcass, wings, engine);
    }

    public PassengerAirplane(int wheels, String carcass, int wings, int engine, int windStick) {
        super(wheels, carcass, wings, engine, windStick);
    }

    public void people() {
        System.out.println("Can transport more than 100 people.");
    }
}
