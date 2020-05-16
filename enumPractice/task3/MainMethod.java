package enumPractice.task3;

public class MainMethod {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The act", 5,3000000,Category.ACTION,Country.USA);
        movie1.totalincome();
        movie1.print();
    }
}
