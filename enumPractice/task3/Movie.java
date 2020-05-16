package enumPractice.task3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Movie {
    String name;
    int price;
    int strem;
    int income;
    Category category;
    Country country;

    public void totalincome(){
        income=price*strem;
    }

    public Movie(String name, int price, int strem, Category category, Country country) {
        this.name = name;
        this.price = price;
        this.strem = strem;
        this.category = category;
        this.country = country;
    }

    public void print(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(strem);
        System.out.println(category);
        System.out.println(country);
        System.out.println(income);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", strem=" + strem +
                ", income=" + income +
                ", category=" + category +
                ", country=" + country +
                '}';
    }
}
