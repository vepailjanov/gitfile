package JavaClass.task3;

public class MainMethod {
    public static void main(String[] args) {
        DevTeam employee1 = new DevTeam();
        employee1.name = "Jack";
        employee1.joblevel = "Senior Devoloper";
        employee1.jobExperience = 13;
        employee1.newInfos.address = "2370 Boynton Pl";
        employee1.newInfos.phone = 551333422;
        employee1.newInfos.email = "vepa.iljanov@gmail.com";
        System.out.println(employee1);
    }
}
