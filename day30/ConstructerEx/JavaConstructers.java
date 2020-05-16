package day30.ConstructerEx;
class Book {
    String name;
    int publishYear;
    public Book(){

    }

    public Book(String name, int publishYear) {
        this.name = name;
        this.publishYear = publishYear;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Year: " + this.publishYear);
    }
}
    public class JavaConstructers {
        public static void main(String[] args) {
            Book book1 = new Book();
            book1.name = "Harry Potter";
            book1.publishYear = 2001;
            book1.print();

            Book book2 = new Book("Java For Beginners", 1995);
            book2.print();


        }
    }

