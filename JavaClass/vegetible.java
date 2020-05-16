package JavaClass;

public class vegetible {
    String color;
    double weight;
    int price;
    long id;

    public static void main(String[] args) {
        vegetible apple = new vegetible();
        apple.color = "red";
        apple.weight = 1.32;
        apple.price = 2;
        apple.id = 23232434;
        System.out.println(apple.color);
        System.out.println(apple.weight);
        System.out.println(apple.price);
        System.out.println(apple.id);
    }
}
