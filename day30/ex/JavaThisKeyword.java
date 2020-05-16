package day30.ex;
 class Car {
    String model;

    public void printMyCar() {
        String model = "My car model";
        System.out.println("Model: " + model);
    }
}


public class JavaThisKeyword {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Ford";
        car1.printMyCar();
    }
}
