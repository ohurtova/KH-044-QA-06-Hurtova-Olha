package Vehicle;

import Airplane.Freighter;
import Airplane.MilitaryAirplane;
import Airplane.PassengerAirplane;

public class Main {

    public static void main(String[] args) {
        PassengerAirplane plane3 = new PassengerAirplane(12, "fuselage", 2);
        System.out.println("1a) Such type of " + plane3.getName() + " usually consists of wide " + plane3.getCarcass() + ", " + plane3.getEngine() + " engines, "
                + plane3.getWings() + " wings and has " + plane3.getWheels() + " wheels (uses for landing).");
        System.out.println(plane3.noise());
        plane3.fly();
        plane3.people();

        PassengerAirplane plane4 = new PassengerAirplane(16, "fuselage", 2, 1);
        System.out.println("1b) Such type of " + plane4.getName() + " usually consists of wide " + plane4.getCarcass() + ", " + plane4.getEngine() + " engines, "
                + plane4.getWings() + " wings and has " + plane4.getWheels() + " wheels (uses for landing). In addition has a " + plane4.getWindStick());
        System.out.println(plane3.noise());
        plane4.fly();
        plane4.people();

        MilitaryAirplane plane1 = new MilitaryAirplane (16, "fuselage", 2);
        System.out.println("2a) Such type of " + plane1.getName() + " usually consists of wide " + plane1.getCarcass() + ", " + plane1.getEngine() + " engines, "
                + plane3.getWings() + " wings and has " + plane1.getWheels() + " wheels (uses for landing).");
        System.out.println(plane1.noise());
        plane1.fly();
        plane1.protection();

        MilitaryAirplane plane2 = new MilitaryAirplane(16, "fuselage", 2, 1);
        System.out.println("2b) Such type of " + plane2.getName() + " usually consists of wide " + plane2.getCarcass() + ", " + plane2.getEngine() + " engines, "
                + plane2.getWings() + " wings and has " + plane2.getWheels() + " wheels (uses for landing). In addition has a " + plane2.getWindStick());
        System.out.println(plane3.noise());
        plane2.fly();
        plane2.protection();

        Freighter plane5 = new Freighter (12, "fuselage", 2);
        System.out.println("3a) Such type of " + plane5.getName() + " usually consists of wide " + plane5.getCarcass() + ", " + plane5.getEngine() + " engines, "
                + plane5.getWings() + " wings and has " + plane5.getWheels() + " wheels (uses for landing).");
        System.out.println(plane1.noise());
        plane5.fly();
        plane5.weight();

        Freighter plane6 = new Freighter (16, "fuselage", 2, 1);
        System.out.println("3b) Such type of " + plane6.getName() + " usually consists of wide " + plane6.getCarcass() + ", " + plane6.getEngine() + " engines, "
                + plane6.getWings() + " wings and has " + plane6.getWheels() + " wheels (uses for landing).");
        System.out.println(plane1.noise());
        plane6.fly();
        plane6.weight();


    }

}
