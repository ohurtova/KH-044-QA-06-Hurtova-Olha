package Airplane;

public class MilitaryAirplane extends Airplane {
    public MilitaryAirplane(int wheels, String carcass, int wings, int engine) {
        super(wheels, carcass, wings, engine);
    }
        public void protection() {
        System.out.println("Can be used in armed forces of some country. Usually such type of airplanes have weapons");
    }
}