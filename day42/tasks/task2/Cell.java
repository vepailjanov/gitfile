package day42.tasks.task2;

public class Cell extends Phone {
      static int price;
      static String demand;
    public Cell(String type, int number,  int price, String demand) {
        super(type, number);
        this.price = price;
        this.demand = demand;
    }


    @Override
    public String toString() {
        return "Cell{" +
                ", type='" + getType() + '\'' +
                ", number=" + getNumber() +'\'' +
                ", price=" + price +'\'' +
                ", demand='" + demand + '\'' +
                '}';
    }
}
