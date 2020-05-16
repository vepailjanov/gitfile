package day28.task2;
class product{
    int getprice;
    int sellprice;

    int  peyda (){
       return sellprice - getprice;
    }
    int month(){
        return peyda() * 30;
    }
    void print(){
        System.out.println("getting price " + getprice);
        System.out.println("selling price " + sellprice);
        System.out.println("income " + peyda());
        System.out.println("monthly income " + month());
    }
}

public class task1 {
    public static void main(String[] args) {
        product apple = new product();
        apple.getprice = 2500;
        apple.sellprice = 3200;
        int income = apple.peyda();
        int monthlyincome = apple.month();
        apple.print();
    }
}
