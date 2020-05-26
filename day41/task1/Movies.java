package day41.task1;

public class Movies {
    private String name;
    private String genres;
    private int year;
    private int reviews;
    private int budget;
    private int boxoffice;

    public Movies(String name, String genres, int year, int reviews, int budget, int boxoffice) {
        this.name = name;
        this.genres = genres;
        this.year = year;
        this.reviews = reviews;
        this.budget = budget;
        this.boxoffice = boxoffice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setReviews(int reviews) {
        if (reviews<9){
            System.out.println("not worth to watch!");
        }
        this.reviews = reviews;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public void setBoxoffice(int boxoffice) {
        this.boxoffice = boxoffice;
    }

    public String getName() {
        return name;
    }

    public String getGenres() {
        return genres;
    }

    public int getYear() {
        return year;
    }

    public int getReviews() {

        return reviews;
    }

    public int getBudget() {
        return budget;
    }

    public int getBoxoffice() {
        return boxoffice;
    }


    public void print(){
        System.out.println("Movie name :"+getName());
        System.out.println("Movie genre :"+getGenres());
        System.out.println("Movie year :"+getYear());
        System.out.println("Movie review :"+getReviews());
        System.out.println("Movie budget :"+getBudget());
        System.out.println("Movie box :"+getBoxoffice());
    }
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", genres='" + genres + '\'' +
                ", year=" + year +
                ", reviews=" + reviews +
                ", budget=" + budget +
                ", boxoffice=" + boxoffice +
                '}';
    }
}
