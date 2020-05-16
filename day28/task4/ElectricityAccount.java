package day28.task4;

public class ElectricityAccount {
    double totalWph;
    double rate = 2.5;
    double bill;
    void calculateBill(){
        bill= rate* totalWph;
    }
}
