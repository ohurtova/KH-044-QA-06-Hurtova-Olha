package Airplane;

public class MilitaryAirplane extends Airplane{

    public MilitaryAirplane(int wheels, String carcass, int wings) {
        super(wheels, carcass, wings);
    }

    public MilitaryAirplane(int wheels, String carcass, int wings, int windStick) {
        super(wheels, carcass, wings, windStick);
    }

    public void protection() {
        System.out.println("Can be used in armed forces of some country. Usually such type of airplanes have weapons");    }
}
