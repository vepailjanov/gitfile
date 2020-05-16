package JavaClass.task4;

public class Prices {
    int StudentsPay;
    int TeachersGetPaid;
    int totalOwnerGets;
    int POs;
    int EachPOsMoney;
    void GetOwnersGettingMoney(){
        totalOwnerGets = StudentsPay-TeachersGetPaid;
    }
    void devidedOwnersMoney(){
       EachPOsMoney = totalOwnerGets%POs;
    }
}
