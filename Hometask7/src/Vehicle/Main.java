package Vehicle;

import Airplane.Freighter;
import Airplane.MilitaryAirplane;
import Airplane.PassengerAirplane;

public class Main {
    public static void main(String[] args) {
        PassengerAirplane plane3 = new PassengerAirplane(12, "fuselage", 2, 2);
        System.out.println("1a) Such type of airplanes usually consists of wide " + plane3.getCarcass() + ", " +
                plane3.getEngine() + " engines, " + plane3.getWings() + " wings and has " + plane3.getWheels() +
                " wheels (uses for landing).");
        plane3.noise();
        plane3.materials();
        plane3.transportation();
        plane3.energy();
        plane3.fuel();
        plane3.speed();
        plane3.people();

        PassengerAirplane plane4 = new PassengerAirplane(16, "fuselage", 2, 4, 1);
        System.out.println("1b) Such type of airplanes usually consists of wide " + plane4.getCarcass() + ", " +
                plane4.getEngine() + " engines, " + plane4.getWings() + " wings and has " + plane4.getWheels() +
                " wheels (uses for landing). In addition has " + plane4.getWindStick() +  " windstick.");
        plane4.noise();
        plane4.materials();
        plane4.transportation();
        plane4.energy();
        plane4.fuel();
        plane4.speed();
        plane4.people();

        Freighter plane1 = new Freighter(20, "fuselage", 2, 4);
        System.out.println("2) Such type of airplanes usually consists of wide " + plane4.getCarcass() + ", " +
                plane4.getEngine() + " engines, " + plane4.getWings() + " wings and has " + plane4.getWheels() +
                " wheels (uses for landing).");
        plane1.noise();
        plane1.materials();
        plane1.transportation();
        plane1.energy();
        plane1.fuel();
        plane1.speed();
        plane1.weight();

        MilitaryAirplane plane2 = new MilitaryAirplane(4, "fuselage", 2, 2);
        System.out.println("3) Such type of airplanes usually consists of wide " + plane4.getCarcass() + ", " +
                plane4.getEngine() + " engines, " + plane4.getWings() + " wings and has " + plane4.getWheels() +
                " wheels (uses for landing).");
        plane2.noise();
        plane2.materials();
        plane2.transportation();
        plane2.energy();
        plane2.fuel();
        plane2.speed();
        plane2.protection();
    }
}
