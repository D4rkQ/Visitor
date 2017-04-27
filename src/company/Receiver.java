package company;

/**
 * Project: Strategy
 * Created by SAILMA on 06.04.2017.
 */
public class Receiver {
    private final String name;
    private final String address;

    public Receiver(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }
}
