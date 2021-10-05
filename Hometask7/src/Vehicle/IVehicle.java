package Vehicle;

public interface IVehicle {
    String name = "Vehicle";

    void materials();

    void noise();

    default void transportation() {
        System.out.println("The main function of every " + name + " - it`s quick and safety transporting to the destination");
    }

}
