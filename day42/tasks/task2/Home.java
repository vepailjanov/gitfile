package day42.tasks.task2;

public class Home extends Phone {
    int length;
    public Home(String type, int number, int length) {
        super(type, number);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Home{" +

                ", type='" + getType() + '\'' +
                ", number=" + getNumber() +'\'' +
                ", length=" + length +'\'' +
                '}';
    }
}
