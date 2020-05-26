package day41.Capsulation;

public class Ex1 {

    public static void main(String[] args) {
        User myUser = new User(3, "aydin@techno", "105443434");

        User vepa = new User();
        vepa.setId(14);
        vepa.setUsername("vepa@techno");
        vepa.setPassword("10204542");

    }
}
