package enumPractice.task1;

public class Sugar {
    int price;
    Sort sort;
    Location location;

    public Sugar(int price, Sort sort, Location location) {
        this.price = price;
        this.sort = sort;
        this.location = location;
    }
    void print(){
        System.out.println("Sugar price is : " + price);
        System.out.println("Sugar sort is : " + sort);
        System.out.println("Sugar location is : " + location);
    }

    @Override
    public String toString() {
        return "Sugar{" +
                "price=" + price +
                ", sort=" + sort +
                ", location=" + location +
                '}';
    }
}
