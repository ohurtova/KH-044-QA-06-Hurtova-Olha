package Airplane;

public class Freighter extends Airplane {

    public Freighter(int wheels, String carcass, int wings) {
        super(wheels, carcass, wings);
    }

    public Freighter(int wheels, String carcass, int wings, int windStick) {
        super(wheels, carcass, wings, windStick);
    }

    public void weight() {
        System.out.println("Can transport loads up to 447 tons");
    }
}
