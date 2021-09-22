package Vehicle;

import Airplane.Airplane;
import Airplane.PassengerAirplane;

public class Main {

    public static void main(String[] args) {
        Airplane plane1 = new Airplane(12, "fuselage", 2);
        System.out.println("1) Such type of " + plane1.getName() + " usually consists of wide " + plane1.getCarcass() + ", " + plane1.getEngine() + " engines, "
                + plane1.getWings() + " wings and has " + plane1.getWheels() + " wheels (uses for landing).");
        System.out.println(plane1.noise());

        Airplane plane2 = new Airplane(8, "fuselage", 2, 1);
        System.out.println("2) Such type of " + plane2.getName() + " usually consists of wide " + plane2.getCarcass() + ", " + plane2.getEngine() + " engines, "
                + plane2.getWindStick() + " propeller, " + plane2.getWings() + " wings and has " + plane2.getWheels() + " wheels (uses for landing).");
        System.out.println(plane2.noise());
        plane1.fly();

        PassengerAirplane plane3 = new PassengerAirplane(12, "fuselage", 2);
        System.out.println("3) Such type of " + plane3.getName() + " usually consists of wide " + plane3.getCarcass() + ", " + plane3.getEngine() + " engines, "
                + plane3.getWings() + " wings and has " + plane3.getWheels() + " wheels (uses for landing).");
        System.out.println(plane3.noise());
        plane3.fly();
        plane3.people();

        PassengerAirplane plane4 = new PassengerAirplane(16, "fuselage", 2);
        System.out.println("4) Such type of " + plane4.getName() + " usually consists of wide " + plane4.getCarcass() + ", " + plane4.getEngine() + " engines, "
                + plane4.getWings() + " wings and has " + plane4.getWheels() + " wheels (uses for landing).");
        System.out.println(plane3.noise());
        plane4.fly();
        plane4.people();
    }

}
