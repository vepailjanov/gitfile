package day42.tasks.task1;

public class Vehicle {
    String name;
    int year;
    int wheelAmount;

    public Vehicle(String name, int year, int wheelAmount) {
        this.name = name;
        this.year = year;
        this.wheelAmount = wheelAmount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", wheelAmount=" + wheelAmount +
                '}';
    }
}
