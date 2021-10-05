package Airplane;

public class PassengerAirplane extends Airplane {

    public PassengerAirplane(int wheels, String carcass, int wings) {
        super(wheels, carcass, wings);
    }

    public PassengerAirplane(int wheels, String carcass, int wings, int windStick) {
        super(wheels, carcass, wings, windStick);
    }

    public void people() {
        System.out.println("Can transport more than 100 people.");
    }
}