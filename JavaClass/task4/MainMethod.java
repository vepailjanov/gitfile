package JavaClass.task4;

public class MainMethod {
    public static void main(String[] args) {
        University Cambridge = new University();
        Cambridge.Teachers = 35;
        Cambridge.Students = 650;
        Cambridge.result.POs = 3;
        Cambridge.result.TeachersGetPaid = 4000;
        Cambridge.result.StudentsPay = 1500;
        Cambridge.result.GetOwnersGettingMoney();
        Cambridge.result.devidedOwnersMoney();
        System.out.println(Cambridge);

    }

}
