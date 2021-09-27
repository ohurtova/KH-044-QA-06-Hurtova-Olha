package Airplane;

public class Freighter extends Airplane {
    public Freighter(int wheels, String carcass, int wings, int engine) {
        super(wheels, carcass, wings, engine);
    }

    public void weight() {
        System.out.println("Can transport loads up to 447 tons");
    }
}
