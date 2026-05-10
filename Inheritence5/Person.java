public class Person {

    protected String name;
    protected String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter name
    public String getName() {
        return name;
    }

    // Getter address
    public String getAddress() {
        return address;
    }

    // Setter address
    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    public String toString() {
        return name + "(" + address + ")";
    }
}
