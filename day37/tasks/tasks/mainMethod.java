package day37.tasks.tasks;

public class mainMethod {
    public static void main(String[] args) throws Exception {
        carpurchase car1 = new carpurchase();
        try {
            car1.buy(condition.USED);
        }catch (Exception e){
            System.out.println("garbage car");
            System.out.println(e.getMessage());
        }
        try {
            car1.drive("rainy");
        }catch (RuntimeException e){
            System.out.println("weather is not good to drive");
            System.out.println(e.getMessage());
        }
    }
}
