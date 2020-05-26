package day41.tasks;

public class Book {
    // create class Book
    // name, author, publishedDate, leatherBoundPrice, hardCoverPrice, audioBookPrice
    // encapsulate Book
    private String name;
    private String author;
    private String publishedDate;
    private String leatherBoundPrice;
    private String hardCoverPrice;
    private String audioBookPrice;

    public Book(){

    }
    public Book(String name, String author, String publishedDate, String leatherBoundPrice, String hardCoverPrice, String audioBookPrice) {
        this.name = name;
        this.author = author;
        this.publishedDate = publishedDate;
        this.leatherBoundPrice = leatherBoundPrice;
        this.hardCoverPrice = hardCoverPrice;
        this.audioBookPrice = audioBookPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setLeatherBoundPrice(String leatherBoundPrice) {
        this.leatherBoundPrice = leatherBoundPrice;
    }

    public void setHardCoverPrice(String hardCoverPrice) {
        this.hardCoverPrice = hardCoverPrice;
    }

    public void setAudioBookPrice(String audioBookPrice) {
        this.audioBookPrice = audioBookPrice;
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }
    public boolean hasThreePrice(){
        return true;
    }
    public String getLeatherBoundPrice() {
        return leatherBoundPrice;
    }

    public String getHardCoverPrice() {
        return hardCoverPrice;
    }

    public String getAudioBookPrice() {
        return audioBookPrice;
    }

    public boolean hasThreePrices(){
        boolean bookhasAllPrices = getHardCoverPrice() != null&&getLeatherBoundPrice()!=null&&getAudioBookPrice()!=null;
        return bookhasAllPrices;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                ", leatherBoundPrice='" + leatherBoundPrice + '\'' +
                ", hardCoverPrice='" + hardCoverPrice + '\'' +
                ", audioBookPrice='" + audioBookPrice + '\'' +
                '}';
    }
}