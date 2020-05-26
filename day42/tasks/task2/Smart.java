package day42.tasks.task2;

public class Smart extends Cell {
    private String users;
    private int amountUsers;
    public Smart(String type, int number, String users, int amountUsers) {
        super(type,number,price,demand);

        this.amountUsers = amountUsers;
        this.users = users;
    }

    @Override
    public String toString() {
        return "Smart{" +
                ", type='" + getType() + '\'' +
                ", number=" + getNumber() +'\'' +
                ", price=" + price +'\'' +
                ", demand='" + demand + '\'' +
                ", users='" + users + '\'' +
                ", amountUsers=" + amountUsers +'\'' +
                '}';
    }
}
