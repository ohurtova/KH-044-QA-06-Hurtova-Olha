package Vehicle;

public interface ICharacteristics {

    void fuel();

    void speed();

    default void energy() {
        System.out.println("All energy for vehicle`s vital activity is produced by engine");
    }
}
