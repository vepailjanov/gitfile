package day30.task1;

public class task1 {
//    create a class Bank
// add at least 3 attributes
// add at least 3 constructors
// add method that return all attributes as one string
// in Task1 class create at least 4 object of that class
// call method to get attributes and print it

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        System.out.println(bank1);

        Bank bank2 = new Bank("Bank Of America", 234234332,32554);
        System.out.println(bank2);
        Bank bank3 = new Bank("Capital one", 234435434,3255454);
        System.out.println(bank3);
        Bank bank5 = new Bank("Capital one", 234435434,3255454);
        System.out.println(bank5);
    }
}
